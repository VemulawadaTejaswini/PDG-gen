import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner src = new Scanner(System.in);


        int n = src.nextInt();

        if(n%1000==0)
            System.out.println(0);
        else{
            int nn =n/1000;
            nn++;
            nn*=1000;
            System.out.println(nn-n);
        }





    }
}
