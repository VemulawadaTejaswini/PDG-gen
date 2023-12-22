import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.nextLine());
        String T = sc.nextLine();
        sc.close();
        boolean ans = false;
        int len = S.length();
        for(int i = 0; i <= len; i++){
            S.insert(0, S.charAt(len-1));
            S.deleteCharAt(len);
            if(S.toString().equals(T)){
                ans = true;
                break;
            }
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");

    }

}
