import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = false;
        if(s.equals("hi")) ans = true;
        if(s.equals("hihi")) ans = true;
        if(s.equals("hihihi")) ans = true;
        if(s.equals("hihihihi")) ans = true;
        if(s.equals("hihihihihi")) ans = true;
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

}
