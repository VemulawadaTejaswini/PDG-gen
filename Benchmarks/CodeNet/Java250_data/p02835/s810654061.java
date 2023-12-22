import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        String rslt = null;
      
        if (a+b+c >= 22) {
          rslt = "bust";
        } else {
          rslt = "win";
        }

      System.out.println(rslt);
	}
}