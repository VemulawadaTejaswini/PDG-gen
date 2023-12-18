import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int result = b * 2
        if (b * 2 < a) {
            System.out.println(a - b * 2);
        } else {
            System.out.println(0);
        }
    }
}