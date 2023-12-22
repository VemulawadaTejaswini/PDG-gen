import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        for(int i = 0; i < 10_000; i++){
            x = sc.nextInt();
            System.out.println("Case "+(i+1) + ": "+x);
            if(x == 0){
                break;
            }
        }
        sc.close();
    }
}
