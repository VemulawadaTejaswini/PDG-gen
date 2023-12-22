import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int a=scan.nextInt();
            int b=scan.nextInt();
            if(a == 0)break;
            for(int j=0;j<1;j++){
                for(int k=0;k<b;k++){
                    System.out.printf("#");
                }
                System.out.println("");
            }
            for(int j=1;j<a-1;j++){
                System.out.printf("#");
                for(int k=0;k<b-2;k++){
                    System.out.printf(".");
                }
                System.out.printf("#");
                System.out.println("");
            }
            for(int j=0;j<1;j++){
                for(int k=0;k<b;k++){
                    System.out.printf("#");
                }
                System.out.println("");
            }
 System.out.println("");
        }
        scan.close();
        return;
    }
}
