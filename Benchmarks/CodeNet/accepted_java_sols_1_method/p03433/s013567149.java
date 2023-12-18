import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int num_one = 0;

        num_one = N%500;

        if(num_one <= A){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
