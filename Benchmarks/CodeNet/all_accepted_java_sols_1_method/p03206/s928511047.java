import java.util.*;

public class Main {
    static HashSet<Integer> dic = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String ans = "Christmas";
        for(int i=d;i<25;i++) ans = ans+" Eve";
        System.out.println(ans);
    }
}