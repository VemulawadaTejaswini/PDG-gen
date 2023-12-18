import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
       Scanner sc = new Scanner(System.in);
       long a = sc.nextInt();
       long b = sc.nextInt();
       long d,r;
       double f,x,y;
       x=a;
       y=b;
       d=a/b;
       f=x/y;
       r=a%b;
       System.out.print(d + " ");
       System.out.print(r + " ");
       System.out.printf("%f\n",f);
	}

}