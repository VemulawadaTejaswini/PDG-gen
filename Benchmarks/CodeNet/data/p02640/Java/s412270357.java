import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();

        for(int i = 0;i<=x;i++){
            int tmp = 2*i + 4*(x-i);
            if(tmp == y){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");

    }

}