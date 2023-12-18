import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int a,b;
    	float c;
    	String str;
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c =(float)a/(float)b;
    	System.out.print(a/b + " " + a%b + " ");
    	System.out.printf("%f\n",c);
    }
}