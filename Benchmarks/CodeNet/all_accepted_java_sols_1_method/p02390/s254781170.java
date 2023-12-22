import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = S / (60 * 60);
        int M = S % (60 * 60);
        int m = M / 60;
        int s = M % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
