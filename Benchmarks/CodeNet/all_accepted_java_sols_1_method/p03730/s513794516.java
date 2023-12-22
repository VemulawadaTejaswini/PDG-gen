import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        if(B==1){
            System.out.println("YES");
        }
        else if(A%2==0&&B%2==0&&C%2==1){
            System.out.println("NO");
        }
        else{
            int i;
            for(i=1;i<B;i++){
                if((A*i)%B==C){
                    System.out.println("YES");
                    return ;
                }
            }
            System.out.println("NO");
        }
    }
}