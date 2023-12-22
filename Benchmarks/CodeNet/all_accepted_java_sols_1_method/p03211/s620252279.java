import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int min = 1000000;
        for(int i = 0; i+2 < s.length();i++){
            String ss = s.substring(i, i+3);
            min = Math.min(min, Math.abs(Integer.parseInt(ss)-753));
        }
        System.out.println(min);
    } 
}