import java.util.Map.Entry;
import java.lang.reflect.Method;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayList;

//import org.w3c.dom.css.Counter;

public class Main {
    // public class App {

    public static void main(final String[] args)throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final Scanner s = new Scanner(System.in);
        String S = s.next();
        String T =s.next();
        int hoge = T.length();
        int ans = hoge;
        //T開始地点
        for(int i =0; i<hoge;i++){
            //T終了地点
            for(int i2 = hoge;i2-i >= 1 ;i2--){
                //検索対象文字
                String huge = T.substring(i,i2);
                //開始地点と、終了地点前後の文字を考慮する
                String Snew = S.substring(i,S.length()-(hoge-i2));
                if(Snew.contains(huge)&& ans > hoge - huge.length()){
                    ans = hoge - huge.length();
                }
            }
        }
                System.out.println(ans);
        
    }
}
