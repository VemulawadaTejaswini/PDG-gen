import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int X=scan.nextInt();
        int max=1;
        int i,j;
        for(i=2;i<=Math.sqrt(X);i++){
            j=i;
            while(j*i<=X){
                j*=i;
            }
            if(max<j){
                max=j;
            }
        }
        System.out.println(max);

    }
}