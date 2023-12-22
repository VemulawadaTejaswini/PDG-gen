import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        String w = scan.nextLine();
        w = w.toLowerCase();
        while(true){
            String s = scan.next();
            if(s.equals("END_OF_TEXT"))break;
            s = s.toLowerCase();
            if(s.equals(w))ans++;
        }
        System.out.println(ans);
    }
}

