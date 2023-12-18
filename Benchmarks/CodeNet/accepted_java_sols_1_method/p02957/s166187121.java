import java.util.Scanner;

public class Main {

    public static void main(String args[] ) throws Exception {


        Scanner s = new Scanner(System.in);


        int a = s.nextInt();    // Reading input from STDIN
        int b = s.nextInt();

        int sum = a+b;
        int k = sum/2;

        if(sum%2==0){
            System.out.println(k);
        }else{
            System.out.println("IMPOSSIBLE");
        }

    }
}

