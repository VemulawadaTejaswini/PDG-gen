import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int a=scan.nextInt();
    	int b=scan.nextInt();
    	int c=scan.nextInt();
    	System.out.print((b>=c?c:b)+" ");
    	System.out.println(b+c-a<0?0:b+c-a);
    }
}