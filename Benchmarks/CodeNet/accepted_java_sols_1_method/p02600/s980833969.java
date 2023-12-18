import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int kai = 8;
        int nc = 600;
        while(true){
            if(n<nc){
                System.out.println(kai);
                break;
            }else{
                nc+=200;
                kai--;
            }
        }
    }
}