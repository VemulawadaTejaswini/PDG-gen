import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S_a = sc.nextLine();
        String S_b = sc.nextLine();
        String S_c = sc.nextLine();
        sc.close();

        int i_a = 0;
        int i_b = 0;
        int i_c = 0;

        char next = 'a';
        String ans = "";

        while(true){
            if(next == 'a') {
                if(i_a == S_a.length()) {
                    ans = "A";
                    break;
                } else {
                    next = S_a.charAt(i_a);
                    i_a++;
                }
            } else if(next == 'b') {
                if(i_b == S_b.length()) {
                    ans = "B";
                    break;
                } else {
                    next = S_b.charAt(i_b);
                    i_b++;
                }
            } else {
                if(i_c == S_c.length()) {
                    ans = "C";
                    break;
                } else{
                    next = S_c.charAt(i_c);
                    i_c++;
                }
            }
        }
        System.out.println(ans);
    }

}