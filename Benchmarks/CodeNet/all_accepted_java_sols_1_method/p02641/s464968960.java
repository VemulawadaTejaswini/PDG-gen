import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int n = sc.nextInt();
        int p[] = new int[n];
        for(int i = 0; i < n; i++){
        	p[i] = sc.nextInt();
        }
        if(n == 0){
        	System.out.println(x);
            return;
        }
        for(int i = 0; i < n; i++){
        	int countm = 0;
            int countp = 0;
            for(int j = 0; j < n; j++){
            	if(x - i != p[j]){
                	countm++;
                }
                if(x + i != p[j]){
                	countp++;
                }
            }
            if(countm == n){
            	System.out.println(x - i);
                return;
            }else if(countp == n){
            	System.out.println(x + i);
                return;
            }
        }
        System.out.println(x - 1);
    }
}