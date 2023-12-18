import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	int k = sc.nextInt();
      	//配列
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
        	if(num[i]>=k){
            	count++;
            }
        }
        System.out.println(count);
     }
}