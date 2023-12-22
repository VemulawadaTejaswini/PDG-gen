import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replace(" ", "");
        int a = Integer.parseInt(s);
        System.out.println(a % (int)Math.sqrt(a) == 0 ? "Yes" : "No");
        scan.close();
    }
}