import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a, b;
        for(;;){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0) break;
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    System.out.printf("#");
                }
                System.out.printf("\n\n");
            }
        }
    }
}