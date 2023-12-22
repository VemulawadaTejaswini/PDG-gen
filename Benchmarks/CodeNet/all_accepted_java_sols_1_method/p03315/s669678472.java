import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int answer = 0;
        s = s.replace("+","");
        answer -= s.length();
        answer += 4-s.length();
        System.out.println(answer);
    }
}