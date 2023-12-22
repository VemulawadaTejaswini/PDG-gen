import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int ans = 700;

        for(int i=0; i<3; i++){
            if(S.substring(i, i+1).equals("o")){
                ans += 100;
            }
        }
        System.out.println(ans);
    }
}