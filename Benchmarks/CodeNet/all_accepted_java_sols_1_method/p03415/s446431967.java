import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String s = "";
        for(int i = 0;i < 3;i++){
            String t = a.next();
            s += t.substring(i, i+1);
        }
        System.out.println(s);
    }
}