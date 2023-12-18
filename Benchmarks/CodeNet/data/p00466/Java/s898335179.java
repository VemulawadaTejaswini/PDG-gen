import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        for(int i=1;i<10;i++) {
            d-=sc.nextInt();
        }
        System.out.println(d);
    }
}
