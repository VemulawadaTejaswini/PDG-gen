import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String endS = S.substring(S.length() - 1);


        System.out.println(endS);

        if (endS.equals("s")){
            S += "es";
            System.out.println(S);
        }else{
            S += "s";
            System.out.println(S);
        }
        sc.close();
    }
}