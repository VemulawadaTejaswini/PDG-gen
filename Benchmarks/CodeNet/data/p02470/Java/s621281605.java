import java.util.Scanner;
 
public class Main {
     
     
     
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int x=n;
            int count=n;
            for(int i=2; i*i<=x; i++) {
                if(n%i==0) {
                    count-=count/i;
                    while(n%i==0) {
                        n/=i;
                    }
                }
            }
            if(n>1) {
                count-=count/n;
            }
            System.out.println(count);
        }
    }
}
