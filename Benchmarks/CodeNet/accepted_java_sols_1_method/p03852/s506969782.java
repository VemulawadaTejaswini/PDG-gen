import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mozi = sc.next();
        if (mozi.equals("a") || mozi.equals("i") || mozi.equals("u") || mozi.equals("e") || mozi.equals("o")){
            System.out.println("vowel");
        }else System.out.println("consonant");
    }
}
