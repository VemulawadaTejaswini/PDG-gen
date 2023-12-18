import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int b = sc.nextInt();

        if(m < b && m + f >= b){
            System.out.println(b - m);
        }else if (m >= b) {
            System.out.println(0);
        }else if (m < b && m + f < b) {
            System.out.println("NA");
        }
        // System.out.println();
    }
}
