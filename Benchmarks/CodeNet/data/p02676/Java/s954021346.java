import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.nextLine());
        String S = sc.nextLine();

//        System.out.println("aaa\n");
        if (S.length() < K){
            System.out.println(S);
        } else {
            System.out.println(S.substring(0,7)+"...");
        }

    }
}
