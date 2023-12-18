import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int A = sc.nextInt();
      int B = sc.nextInt();
      if(A >= 13){
        System.out.println(B);
      }else if(A <= 12 && A >= 6){
        System.out.println(B / 2);
      }else{
        System.out.println(0);
      }
	}
}
