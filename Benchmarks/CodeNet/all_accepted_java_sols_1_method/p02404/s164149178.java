import java.util.Scanner;


public class Main{
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        
        int i,j,k;
        while(true){
            int a = sc.nextInt();
        int b = sc.nextInt();
            if(a==0 && b==0){
                break;
            }

        for(i = 0;i<b;i++){
            System.out.printf("#");
        }for(j=1;j<a-1;j++){
            System.out.printf("\n");
            System.out.printf("#");
            for(k=1;k<b-1;k++){
                System.out.printf(".");
            }
            System.out.printf("#");
        }
        System.out.printf("\n");
        for(i = 0;i<b;i++){
            
            System.out.printf("#");
        }
        System.out.printf("\n");
        System.out.printf("\n");
        }
        
        sc.close();
    }
}
