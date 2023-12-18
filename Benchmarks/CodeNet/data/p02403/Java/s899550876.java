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
            for(int j=0;j<a;j++){
                for(int i=0;i<b;i++){
                    System.out.printf("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
