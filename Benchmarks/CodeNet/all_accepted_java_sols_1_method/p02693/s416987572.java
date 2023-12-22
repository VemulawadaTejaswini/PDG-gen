import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int K= scan.nextInt();

        int A= scan.nextInt();

        int B= scan.nextInt();

        int N=A%K;
        if((N+B-A>=K)||(N==0)){System.out.println("OK");}
        else {System.out.println("NG");};



        // write your code here
    }
}