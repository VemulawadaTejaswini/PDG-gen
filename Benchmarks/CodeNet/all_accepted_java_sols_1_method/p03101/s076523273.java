import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int H=in.nextInt();
        int W=in.nextInt();
        int h=in.nextInt();
        int w =in.nextInt();
        int n=H-h;
        int c=W-w;
        int re=n*c;
        System.out.println(re);
        
        
    }
}