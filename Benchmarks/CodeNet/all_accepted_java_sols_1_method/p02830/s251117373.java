import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int l=scan.nextInt();
        String a=scan.next();
        String b=scan.next();
        for (int i=0;i<l;i++){
            System.out.print(a.substring(i,i+1) + b.substring(i,i+1));
        }
    }
}