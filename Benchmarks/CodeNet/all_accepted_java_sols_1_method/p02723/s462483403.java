import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = 0;
        if(S.charAt(2) == S.charAt(3)) i++;
        if(S.charAt(4) == S.charAt(5)) i++;
        if(i == 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}