import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
 
        if (Math.abs(a - c) <= d){
            System.out.print("Yes");
        } else if (Math.abs(a-b) <=d && Math.abs(b-c) <= d) {
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
}