import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int output = C - (A - B);
		if(output < 0){
          System.out.println(0);
        }else{
          System.out.println(output);
        }
	}
}