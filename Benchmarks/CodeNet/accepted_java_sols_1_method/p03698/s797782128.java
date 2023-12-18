import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for(char c : s){
            hs.add(c);
        }
        if(s.length == hs.size()){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}