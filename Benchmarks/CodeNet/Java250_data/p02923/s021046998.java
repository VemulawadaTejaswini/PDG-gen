import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	int max = 0;
      	//配列
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n-1; i++){
          if(num[i] >= num[i+1]){
              count++;
          if(count>max){
              max = count;
            }
        }else{
            if(max<count){
         	max = count;
          }
            count = 0;
        }
        }
        System.out.println(max);
     }
}