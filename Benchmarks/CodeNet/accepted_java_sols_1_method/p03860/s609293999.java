import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] atcoder = sc.next().split("");
        String[] s = sc.next().split("");
        String[] contest = sc.next().split("");
        
        System.out.println(atcoder[0] + s[0] + contest[0]);
    }
}