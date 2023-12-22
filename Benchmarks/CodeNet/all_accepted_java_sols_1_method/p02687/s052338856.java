import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if(S.equals("ABC")) {
            S = "ARC";
        } else {
            S = "ABC";
        }
        System.out.println(S);
    }
}
