import java.util.Scanner;
//0608
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt();
        System.out.println(Math.min(a*e,b+(e-c>0?(e-c)*d:0)));
    }
}
