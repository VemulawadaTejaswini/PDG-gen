import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String W = text.next().toUpperCase();
        int cnt = 0;
        boolean flag = false;
        String end = "END_OF_TEXT";

        while(true) {
            String[] N = text.next().split(" ");
        
            for(String tex : N){
                if(tex.equals(end)) {
                    flag = true;
                    break;
                } else if(tex.toUpperCase().equals(W)) {
                    cnt++;
                }
            }
            if(flag) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
