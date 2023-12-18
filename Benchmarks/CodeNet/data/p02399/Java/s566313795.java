import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int a = stdin.nextInt();
	int b = stdin.nextInt();
	int d = a/b;
	int r = a%b;
	float f = (float)a/(float)b;
	System.out.print(d+" "+r+" ");
	System.out.printf("%.8f %n", f);
    }
}