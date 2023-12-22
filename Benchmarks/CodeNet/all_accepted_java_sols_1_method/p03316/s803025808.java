import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = n;
        int sn = 0;

        do{
            sn += a % 10;
            a /= 10;
        }while(a > 0);

        if(n % sn == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}