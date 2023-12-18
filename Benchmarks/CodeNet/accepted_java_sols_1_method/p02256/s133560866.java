import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while(true){
        int result = a % b;
        if(result == 0){
            System.out.println(b);
            break;
        }else{
            a = b;
            b = result;
        }
        }
    }
}
