import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mid = (a+b)/2;
        System.out.println(mid);
        sc.close();
    }
}

