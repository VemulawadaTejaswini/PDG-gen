import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] num = new int[n];
      int count = 0;
      for(int i = 0;i < n;i++){
      	num[i] = sc.nextInt();
      }
      
      Arrays.sort(num);
      
      for(int i = 1;i < n;i++){
      	if(num[i-1]<num[i]){
        	count++;
        }
      }
      System.out.println(count+1);
    }
}