import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        if(A==B && B==C)System.out.printf("No");
        else if(A!=B && B==C)System.out.printf("Yes");
             else if(A==B && B!=C)System.out.printf("Yes");
                  else if(A==C && A!=B)System.out.printf("Yes");
                       else System.out.printf("No");
    }
}