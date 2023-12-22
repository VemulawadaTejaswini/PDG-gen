import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/3600 + ":" + (n%3600)/60 + ":" + n%60);
        sc.close();
    }
}
