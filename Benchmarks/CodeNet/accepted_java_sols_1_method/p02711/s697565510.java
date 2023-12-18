import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean b = Integer.toString(n).indexOf("7") >= 0;
        System.out.println(b ? "Yes" : "No");
    }
}