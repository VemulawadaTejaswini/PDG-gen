import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0){
                sc.close();
                return;
            }
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if((i+j)%2==0){
                        System.out.printf("#");
                    }else{
                        System.out.printf(".");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
