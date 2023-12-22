import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        for(int x = 1; x <= n; x++){
            if(String.valueOf(x).contains("3")){
                System.out.print(" " + x);
            }
            else if(x % 3 == 0){
                System.out.print(" " + x);
            }
            else if(x % 10 == 3){
                System.out.print(" " + x);
            }
            else{
                i = x /10;
                if(i % 10 == 3){
                    System.out.print(" " + x);
                }
            }
        }
        System.out.println();
    }
}
