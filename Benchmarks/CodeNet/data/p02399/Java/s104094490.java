import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = x/y;
        int r = x%y;
        double f = (double)x / (double)y;
        System.out.println(d+" "+r+" "+f);
    }
}