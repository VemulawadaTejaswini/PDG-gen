import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A>=2*B){
            System.out.println(A - 2*B);
        }
        else if(A<2*B){
            System.out.println(0);
        }
    }
}