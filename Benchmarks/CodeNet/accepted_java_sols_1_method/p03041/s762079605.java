import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] str = sc.next().split("");

        str[k-1] = str[k-1].toLowerCase();
        String result = "";
        for (String s : str) result += s;
      
        System.out.println(result);
    }
}
