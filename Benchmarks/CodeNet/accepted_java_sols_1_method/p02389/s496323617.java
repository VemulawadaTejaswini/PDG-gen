import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] spline = line.split(" ");
        int a = Integer.parseInt(spline[0]);
        int b = Integer.parseInt(spline[1]);
        int space = a*b;
        int loop = 2*(a+b);
        System.out.println(space+" "+loop);
    }
}
