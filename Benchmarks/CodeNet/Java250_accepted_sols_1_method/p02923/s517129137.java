import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int right = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
            if(i >= 1 && num[i] <= num[i - 1]){
                right++;
            }else{
                right = 0;
            }
            if(count < right){
                count = right;
            }
        }
        System.out.println(count);
    }
}