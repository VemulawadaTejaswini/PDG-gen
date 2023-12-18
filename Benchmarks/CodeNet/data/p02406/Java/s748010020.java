import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i,N,k;
        N=sc.nextInt();
        for(i=1;i<=N;i++){
            if((i%3==0)||(i%10==3)){
                System.out.print(" "+i);
            }else if((10<=i)&&(i<=100)){
                k=i/10;
                if(k==3){
                    System.out.print(" "+i);
                }    
            }else if(i<1000){
                k=i/100;
                if(k==3){
                    System.out.print(" "+i);
                }
            }else if(i<=10000){
                k=i/1000;
                if(k==3){
                    System.out.print(" "+i);
                }
            }                    
        }
        System.out.println();   
    }
}
