import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in = new  Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = in.nextInt();
        int count = 0;
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                for(int k = 0; k <= c; k++){
                    if((i * 500 + j * 100 + k * 50) == x){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
