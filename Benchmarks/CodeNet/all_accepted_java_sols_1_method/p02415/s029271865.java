import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<S.length(); i++){
            char a = S.charAt(i);
            if(Character.isUpperCase(a)) sb.append(Character.toLowerCase(a));
            else if(Character.isLowerCase(a)) sb.append(Character.toUpperCase(a));
            else sb.append(a);
        }

        System.out.println(sb);
    }
}
