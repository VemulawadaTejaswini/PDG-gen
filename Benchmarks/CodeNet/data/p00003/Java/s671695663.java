import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean hypotenuseA = (a * a == b * b + c * c);
            boolean hypotenuseB = (b * b == a * a + c * c);
            boolean hypotenuseC = (c * c == a * a + b * b);
            if(A|B|C) {
                System.out.println("YES");
            } else {
                                System.out.println("NO");
            }
        }
    }
}