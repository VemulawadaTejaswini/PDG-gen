import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String[] ABCList = S.split("ABC",-1);

        System.out.println(ABCList.length-1);


    }

}
