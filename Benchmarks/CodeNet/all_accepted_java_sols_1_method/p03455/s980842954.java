import java.util.Scanner;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
		int c = a*b;
      	String result = "";
        if (c % 2 == 0) {
          result = "Even";
        } else {
		  result = "Odd";
        }
        System.out.println(result);
	}
}