
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
        boolean uge = true;
        for(int i =0; i<hoge;i++){
            for(int i2 = hoge;i2-i >= 1 ;i2--){
                String huge = T.substring(i,i2);
                String Snew = S.substring(i,S.length());
                if(Snew.contains(huge) && uge){
                    System.out.println(hoge - huge.length());
                    uge = false;
                    break;
                }
            }
        }
            
            if(uge){
                System.out.println(hoge);
            }
    }
}