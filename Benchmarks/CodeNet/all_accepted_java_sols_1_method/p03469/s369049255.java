import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        String A = new String("2018");

        A = A.concat(S.substring(4));
        System.out.println(A);
        }
}