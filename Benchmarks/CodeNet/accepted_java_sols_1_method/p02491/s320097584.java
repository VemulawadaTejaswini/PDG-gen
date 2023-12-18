import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    double f;
	    f=(double)a/b;
	    System.out.printf("%d ",a/b);
	    System.out.printf("%d ",a%b);
	    System.out.printf("%.5f\n",f);
    }
}