import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    	int k = sc.nextInt();

    	String aaa = Integer.toString(n,k);

    	System.out.println(aaa.length());
    }
}