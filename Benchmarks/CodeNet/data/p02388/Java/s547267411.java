import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y=Math.pow(x,3);
        int z=(int)y;
        System.out.println(z);
    }
}
