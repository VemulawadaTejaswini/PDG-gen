
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new C().doIt();
    }
    class C{
    	void doIt(){
    		ArrayList<ArrayList<Pair>> array = new ArrayList<ArrayList<Pair>>();
    		int N = sc.nextInt();
    		int length = 1 << N;
    		double dp[] = new double [length];
    		double limit_M[] = new double[length];
    		limit_M[0] = sc.nextDouble();
    		for(int i = 0;i < N;i++){
    			int n = sc.nextInt();
    			ArrayList<Pair> array2 = new ArrayList<Pair>();
    			for(int j = 0;j < n;j++){
    				array2.add(new Pair(sc.nextDouble(),sc.nextDouble()));
    			}
    			array.add(array2);
    		}
    		for(int i = 0;i < length;i++){
    			for(int j = 0;j < N;j++){
    				if((i >> j)%2 == 1)continue;
        			else{
        				ArrayList<Pair> array2 = new ArrayList<Pair>();
        				array2 = array.get(j);
        				double H = 0;
        				double M = limit_M[i];
        				for(int k = 0;k < array2.size();k++){
        					if(M >= array2.get(k).w * array2.get(k).h){
        						H = H + array2.get(k).h;
        						M = M - (array2.get(k).w * array2.get(k).h);
        					}else{
        						H = H + (M / array2.get(k).w);
        						M = 0;
        						break;
        					}
        				}
        				if(dp[i+(1 << j)] < dp[i] + H){
        					dp[i+(1 << j)] = dp[i]+H;
        					limit_M[i+(1 << j)] = M;
        				}else if(dp[i+(1 << j)] == dp[i] + H){
        					limit_M[i+(1 << j)] = Math.max(M, limit_M[i+(1 << j)]);
        				}
        			}
    			}
    		}
//    		for(int i = 0;i < length;i++){
//    			System.out.println(i+" "+dp[i]+" "+limit_M[i]);
//    		}
    		System.out.println(dp[length-1]);
    	}
    	class Pair{
    		double w,h;
    		public Pair(double w,double h){
    			this.w = w;
    			this.h = h;
    		}
    	}
    }
}