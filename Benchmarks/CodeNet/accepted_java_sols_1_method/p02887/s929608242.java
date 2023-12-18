import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] ch = new char[n];
        for(int i=0; i<n; i++) {
            ch[i] = s.charAt(i);
        }
        int count = 1;
        for(int i=0; i<n-1; i++) {
            if(ch[i] != ch[i+1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}