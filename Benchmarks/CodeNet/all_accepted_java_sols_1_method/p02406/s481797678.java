import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i <= n;i++){
            if(i%3 == 0){
                System.out.printf(" %d",i);
            }else if((int)(i%10) == 3){
                System.out.printf(" %d",i);
            }else if((int)(i%100) == 3){
                System.out.printf(" %d",i);
            }else if((int)(i%1000) == 3){
                System.out.printf(" %d",i);
            }else if((int)(i/10) == 3){
                System.out.printf(" %d",i);
            }else if((int)(i/100) == 3){
                System.out.printf(" %d",i);
            }else if((int)(i/1000) == 3){
                System.out.printf(" %d",i);
            }else if((int)(i/10)%10 == 3){
                System.out.printf(" %d",i);
            }else if((int)(i/10)%100 == 3){
                System.out.printf(" %d",i);
            }else if((int)(i/100)%10 == 3){
                System.out.printf(" %d",i);
            }else{

            }
        }
        System.out.printf("\n");
    }
}
