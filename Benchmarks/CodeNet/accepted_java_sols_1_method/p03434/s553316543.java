import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            
            int[] list = new int[n];
            
            for(int i=0; i<n; i++){
            	int a = sc.nextInt();
            	list[i] =a;
            }
            Arrays.sort(list);
            int sum1 = 0;
            int sum2 = 0;
            for(int i=0; i<n; i+=2){
            	sum1 += list[i];
            	if(i!=n-1){
            		sum2 += list[i+1];
            	}
            }
            //出力
            System.out.println(Math.abs(sum1 - sum2));
            sc.close();
        }
    }