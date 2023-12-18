import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        char[] c = s.toCharArray();
        int hugs = 0;
        for(int i=0; i<l/2; i++){
            if(c[i] != c[l-1-i]) hugs++;
        }
        System.out.println(hugs);
    }
}