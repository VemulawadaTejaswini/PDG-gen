import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a!=0 && b!=0){
            for(int i=0;i<b;i++){
                System.out.printf("#");
            }
            System.out.printf("\n");
            for(int j=0;j<a-2;j++){
                System.out.printf("#");                    
                for(int k=0;k<b-2;k++){
                System.out.printf(".");
                }
                System.out.printf("#\n");
            }
            for(int i=0;i<b;i++){
                System.out.printf("#");
            }
            System.out.printf("\n\n");
            a=sc.nextInt();
            b=sc.nextInt();
        }
    }
}
