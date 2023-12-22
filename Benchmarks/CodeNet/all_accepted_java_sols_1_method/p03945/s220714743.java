import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean[] bool = new boolean[s.length()];
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='W'){
                bool[i]=true;
            }else{
                bool[i]=false;
            }
        }
        int count = 0;
        for (int i=0;i<s.length()-1;i++){
            if (bool[i]!=bool[i+1])count++;
        }
        System.out.println(count);
    }

}