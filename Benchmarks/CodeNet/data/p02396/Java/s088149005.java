import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        
        for(int i = 1; i <= 10000; i++){
            int x = scan.nextInt();
            if(x == 0){
                break;
            }
            System.out.println("case " + i + ": " + x);
        }
    }
}