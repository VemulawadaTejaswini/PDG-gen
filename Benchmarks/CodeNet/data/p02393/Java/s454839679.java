import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0;
        for(int i = 0; i < 3; i++) {
            if (a > b) {x = a; a = b; b = x;}
            else if (b > c) { x = b; b = c; c = x;}
            else if (a > b) { x = a; a = b; b = x;}
        }
        System.out.println(a + " " + b + " " + c);
    }
}
