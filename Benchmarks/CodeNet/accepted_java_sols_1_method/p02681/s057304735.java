import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        int ls = s.length();
        int lt = t.length();
        String out = new String();

        String subt = t.substring(0, ls);
        if(1 <= ls && ls <= 10 && ls + 1 == lt && s.equals(subt)){
            out = "Yes";
        } else{
            out = "No";
        }

        System.out.println(out);
        sc.close();
    }
}