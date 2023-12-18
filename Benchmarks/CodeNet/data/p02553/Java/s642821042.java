import java.util.Scanner;

public class ProductMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        int max = a * c;
        for(int i = a; i <= b; i++){
            for(int j = c; j <= d; j++){
                if(i*j > max){
                    max = i*j;
                }
            }   
        }
        System.out.println(max);
    }
    
}