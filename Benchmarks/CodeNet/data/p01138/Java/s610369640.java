import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new A().doIt();
    }
    class A{
        void doIt(){
        	while(true){
        		int map[] = new int [100000];
        		int n = sc.nextInt();
        		if(n == 0)break;
        		for(int i = 0;i < n*2;i++){
        			String str[] = sc.next().split(":");
        			if(i % 2 == 0){
        				map[Integer.parseInt(str[0])*3600 + Integer.parseInt(str[1])*60 + Integer.parseInt(str[2])]++;
        			}else{
        				map[Integer.parseInt(str[0])*3600 + Integer.parseInt(str[1])*60 + Integer.parseInt(str[2]) - 1]--;
        			}
//        			System.out.println(Integer.parseInt(str[0])*3600 + Integer.parseInt(str[1])*60 + Integer.parseInt(str[2]));
        		}
        		int max = map[0];
        		for(int i = 1;i < 100000;i++){
        			map[i] = map[i] + map[i-1];
        			max = Math.max(max,map[i]);
        		}
        		System.out.println(max);
        	}
        }
    }
}