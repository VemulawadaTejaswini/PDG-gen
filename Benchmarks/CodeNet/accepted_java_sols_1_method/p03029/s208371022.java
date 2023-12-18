import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int P = scanner.nextInt();
        int ans = (A*3+P)/2;
        System.out.println(ans);
    }
}