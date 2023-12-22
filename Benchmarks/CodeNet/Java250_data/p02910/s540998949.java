import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = new char[s.length()];
        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if(i % 2 != 0) {
                switch(c) {
                case 'L':
                case 'U':
                case 'D':
                    break;
                default:
                    System.out.println("No");
                    return;
                }
            }
            else {
                switch(c) {
                case 'R':
                case 'U':
                case 'D':
                    break;
                default:
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}