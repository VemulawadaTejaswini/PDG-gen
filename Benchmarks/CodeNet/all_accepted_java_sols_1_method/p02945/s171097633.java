import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(),B = scan.nextInt();
        if(A+B < A*B && A-B < A*B){
            System.out.println(A*B);

        }else if(A-B < A+B && A*B < A+B){
            System.out.println(A+B);
        }else{
            System.out.println(A-B);
        }
    }
}