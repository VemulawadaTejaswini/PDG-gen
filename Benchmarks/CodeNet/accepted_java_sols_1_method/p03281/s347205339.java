import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      int result = 0;
      for(int i = 1;i <= n;i++){
      	for(int j = 1;j <= i;j++){
        	if(i%j == 0 && i%2!=0)count++;
        }
        if(count == 8)result++;
        count = 0;
      }
      System.out.println(result);
    }
}