import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 1, res = 0;

        for(int i = b-a-1; i>1; i-- ) {
            min += i;
        } 
        res = min - a;

        System.out.println(res);

        sc.close();
    }
}