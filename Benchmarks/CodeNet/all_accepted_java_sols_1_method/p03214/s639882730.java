import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        double ave = 0;
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
            ave += num[i];
        }
        ave = ave / n;
        double min = Math.abs((double)num[0] - ave);
        int ans = 0;
        for(int i = 1; i < n; i++){
            double difnum = Math.abs((double)num[i] - ave);
        	if(min > difnum){
            	min = difnum;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}