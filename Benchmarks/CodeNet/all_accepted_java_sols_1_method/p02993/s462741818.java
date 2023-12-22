import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String A = S.substring(0,1);
      String B = S.substring(1,2);
      String C = S.substring(2,3);
      String D = S.substring(3,4);
      if(A.equals(B)||B.equals(C)||C.equals(D)){
        System.out.println("Bad");
      }else{
        System.out.println("Good");
      }
    }
}