import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int A_2 = sc.nextInt();
      int A_3 = sc.nextInt();
      if(A+A_2+A_3>=22){
        System.out.println("bust");
      }else{
        System.out.println("win");
      }
    }
}