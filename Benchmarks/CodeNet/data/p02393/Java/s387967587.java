import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         
         if(a<=b && b<=c){System.out.println(a+" "+b+" "+c);}
         if(a<=b && b>=c && a>=c){System.out.println(c+" "+a+" "+b);}
         if(a<=b && b>=c && a<=c){System.out.println(a+" "+c+" "+b);}
         if(a>=b && b>=c){System.out.println(c+" "+b+" "+a);}
         if(a>=b && b<=c && a>=c){System.out.println(b+" "+c+" "+a);}
         if(a>=b && b<=c && a<=c){System.out.println(b+" "+a+" "+c);}
	}

}