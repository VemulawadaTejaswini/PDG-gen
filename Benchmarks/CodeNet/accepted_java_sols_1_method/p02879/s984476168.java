import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        int A,B,mult;
        Scanner sc = new Scanner(System.in);

        do {
            A = sc.nextInt();
        }while (!(A>=1 && A<=20));

        do {
            B= sc.nextInt();
        }while (!(B>=1 && B<=20));

        if (A<=9 && B<=9){
            System.out.println(mult=A*B);
        }else {
            System.out.println(-1);
        }
    }
}
