import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            System.out.print(n+":");
            int x=n;
            for(int i=2; i*i<=x; i++) {
                while(n%i==0) {
                    System.out.print(" "+i);
                    n/=i;
                }
            }
            if(n!=1)
                System.out.println(" "+n);
            else
                System.out.println();
 
 
 
        }
    }
}
