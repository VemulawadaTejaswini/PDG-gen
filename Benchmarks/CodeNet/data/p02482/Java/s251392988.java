import java.util.Scanner;

class Main{
    public static void main(String args[]){
	int a,b;
	Scanner in = new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	System.out.print(a);
	if (a > b)System.out.print(" > ");
	else if (a == b)System.out.print(" == ");
	else if (a < b)System.out.print(" < ");
	System.out.println(b);
    }
}