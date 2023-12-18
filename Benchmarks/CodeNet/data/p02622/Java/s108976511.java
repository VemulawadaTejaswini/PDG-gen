import java.util.Scanner;
class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String S = scan.next();
        String T = scan.next();
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < S.length() && j < T.length()) {
            if(S.charAt(i) != T.charAt(j)){
                count++;
            }
            i++;
            j++;
        }
        System.out.println(count);
    }
}
