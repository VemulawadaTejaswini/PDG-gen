import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int output = 0;	
      int N = sc.nextInt();
      int H = sc.nextInt();
      int W = sc.nextInt();
      while(sc.hasNext()){
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A >= H && B >= W){
          output++;
        }
      }
      System.out.println(output);
	}
}
