import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String S = sc.nextLine();
        sc.close();
        
        int count = 0;
        S = S.replace("ABC", "*");
        for(int i = 0; i < S.length(); i++){
            char a = S.charAt(i);
            String s = String.valueOf(a);
            if(s.equals("*")){
                count++;
            }
        }
        System.out.println(count);
    }

}