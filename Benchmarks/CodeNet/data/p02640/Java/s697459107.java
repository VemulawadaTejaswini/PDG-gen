import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int e=b%2;
        int c=0;
        int flg=0;
        if(e==0 && a!=0 && b!=0){
            for(int i=0; i<=a; i++){
                c=4*(a-i)+2*i;
                if(b==c){
                    flg=1;
                }
            }
            if(flg==1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}