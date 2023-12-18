import java.util.Scanner;

public class Main{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            int n=i;
            if(n%3==0){
                System.out.printf(" %d",i);
            }else 
                while(n!=0){
                    if(n%10==3){
                        System.out.printf(" %d",i);
                        break;
                     }
                    n/=10;
                 } 
            }
        System.out.print("\n");
    }
}
