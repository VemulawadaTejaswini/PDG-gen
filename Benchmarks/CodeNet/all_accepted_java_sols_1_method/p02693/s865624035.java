import java.util.Scanner;

public class Main {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean check = false;

        for (int n = a;n <= b ; n++){
            if(n % k == 0){
                check = true;
                break;
            }
        }

        if(check){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}
