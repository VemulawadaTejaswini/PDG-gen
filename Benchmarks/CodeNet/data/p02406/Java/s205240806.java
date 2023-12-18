import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.printf(" %d",i);
            }else if(i%10==3){
                System.out.printf(" %d",i);
            }else if(i/10==3){
                System.out.printf(" %d",i);
            }else if(i/100==3){
                System.out.printf(" %d",i);
            }else if(i/1000==3){
                System.out.printf(" %d",i);
            }
        }
        System.out.printf("\n");
    }
}
