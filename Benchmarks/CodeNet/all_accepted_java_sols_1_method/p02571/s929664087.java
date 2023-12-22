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
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
        String T = sc.next();
        String hoge;
        int ans =999999;
		for(int i=0;i<S.length()-T.length()+1;i++){
			hoge=S.substring(i,i+T.length());
			int tmp=0;
			for(int i2=0;i2<T.length();i2++){
				if(T.charAt(i2)!=hoge.charAt(i2)){
                    tmp++;
                }
			}
			if(ans>tmp){ans=tmp;}
		}
        System.out.println(ans);
    }

}