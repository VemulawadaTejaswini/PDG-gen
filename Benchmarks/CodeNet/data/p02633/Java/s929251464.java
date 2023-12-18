import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 360;
        boolean flag=false;

        while(!flag){
            if(num % n == 0){
                flag=true;
                System.out.println(num/n);
            }else{
                num+=360;
            }
        }
    }
}