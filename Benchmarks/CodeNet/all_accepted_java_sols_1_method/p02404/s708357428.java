import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0){
                System.exit(0);
            }
            for(int i=0;i<b;i++){
                System.out.printf("#");
            }
            System.out.println("");

            for(int j=1;j<a-1;j++){
                System.out.printf("#");
                for(int i=1;i<b-1;i++){
                    System.out.printf(".");
                }
                System.out.printf("#");
                System.out.println("");
            }
            for(int i=0;i<b;i++){
                System.out.printf("#");
            }
            System.out.println("");

            System.out.println("");
        }
    }
}
