import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C,D,left=0,right=0;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        D=sc.nextInt();
        left = A+B;
        right = C+D;

        if(left>right) System.out.println("Left");
        else if(right>left) System.out.println("Right");
        else System.out.println("Balanced");

    }
}
