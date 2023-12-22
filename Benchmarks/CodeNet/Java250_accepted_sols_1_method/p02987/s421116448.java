import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    static Scanner sc=new Scanner(in);
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String s=sc.next();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int c=0;
        for (Integer k:map.values())c+=k==2?1:0;
        out.println(c==2?"Yes":"No");
    }
}
