import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner src = new Scanner(System.in);


        int n = src.nextInt();

        if(n>=1000)
            System.out.println(n%1000);
        else
            System.out.println((1000-n));





    }
}