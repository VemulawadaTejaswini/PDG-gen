import java.util.Scanner;
 
    class Main {
    public static void main(String args[] )  {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();	
	    int b = sc.nextInt();
            int i = a * b;
            int o = (a+b)*2;
            System.out.printf("%d %d%n",i,o);
        }
    }