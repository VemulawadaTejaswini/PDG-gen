import java.util.Scanner;

public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();
      sc.close();

      if (a==0 && b==0) {
    	  System.out.println(0);
    	  return;
      }

      long answer = n/(a+b)*a;
      if (n%(a+b) <a) {
    	  answer+=n%(a+b);
      } else {
    	  answer+=a;
      }
      System.out.println(answer);
  	}
}