import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println((x-a)%b);
    }
}
