import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");

        String result = "Good";
        if (str[0].equals(str[1]) || str[1].equals(str[2]) || str[2].equals(str[3])) {
          	result = "Bad";
        }
        
        System.out.println(result);
    }
}
