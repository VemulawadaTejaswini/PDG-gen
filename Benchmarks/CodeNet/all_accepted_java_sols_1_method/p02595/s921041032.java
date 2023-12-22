import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
		long d = sc.nextLong();
      	int count = 0;
      	long doubled = d*d;
      
      for(int i = 0; i < n ; i++){
      	long x = sc.nextLong();
      	long y = sc.nextLong();
        if((x*x + y*y)<= doubled){
        	count++;
        }
      }

		System.out.println(count);

		
	}
}