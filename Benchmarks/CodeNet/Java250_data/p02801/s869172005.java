import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String N=sc.next();
	char[] c=N.toCharArray();
	System.out.println(++c[0]);

}
}