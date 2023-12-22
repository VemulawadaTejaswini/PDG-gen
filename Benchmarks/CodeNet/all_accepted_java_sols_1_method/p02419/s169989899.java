import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        while(true){
            String in = sc.next();
            if(in.equals("END_OF_TEXT")) break;
            String lower_in = in.toLowerCase();
            if(lower_in.equals(s)) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
