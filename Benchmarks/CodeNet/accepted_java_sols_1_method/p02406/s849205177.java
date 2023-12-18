import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,i=0,syo;
        n=scan.nextInt();

        while(i<n){
            i++;
        if(i%3==0){
            System.out.print(" "+i);
            continue;
        }
        syo=i;
        while(syo!=0){
            if(syo%10==3){
                System.out.print(" "+i);
                break;
            }
            syo/=10;
        }
        
    }
    System.out.println("");

    }
}
