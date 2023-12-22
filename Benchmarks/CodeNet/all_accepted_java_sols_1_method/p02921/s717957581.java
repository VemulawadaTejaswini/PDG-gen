import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int Ans = 0;
        for (int i=0;i<3;i++){if(S.charAt(i)==T.charAt(i)){Ans += 1;}}
        System.out.println(Ans);
    }
}