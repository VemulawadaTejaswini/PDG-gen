import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.next());
        if(s.charAt(0) != 'A'){
            s.insert(0, 'A');
        }
        int index = s.indexOf("HB");
        if(index != -1){
            s.insert(index + 1, "A");
        }
        index = s.indexOf("BR");
        if(index != -1){
            s.insert(index + 1, "A");
        }
        if(s.charAt(s.length() - 1) != 'A'){
            s.insert(s.length(), 'A');
        }

        System.out.println(s.toString().equals("AKIHABARA") ? "YES" : "NO");

    }
}
