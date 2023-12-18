import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int z;
        if(a < b){
            z = a;
            a = b;
            b = z;
        }

        int temp = 1;
        while(temp != 0){
            temp = a % b;
            if(temp == 0){
                break;
            }
            a = b;
            b = temp;
        }

        System.out.println(b);
    }
}
