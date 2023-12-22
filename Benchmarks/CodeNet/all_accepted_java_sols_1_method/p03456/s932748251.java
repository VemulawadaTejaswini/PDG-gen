import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int dig;
        if((b / 100) >= 1){
            dig = 1000;
        }else  if(b / 10 >= 1){
            dig = 100;
        }else{
            dig = 10;
        }
        b = b + a * dig;

        for(int i = 1; i < 320; i++){
            if(b == i * i){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}