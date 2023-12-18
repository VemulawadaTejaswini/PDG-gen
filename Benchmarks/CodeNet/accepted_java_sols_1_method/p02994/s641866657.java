
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n= in.nextInt();
        int L= in .nextInt();

        if(L>=0){
            int sum=0;
            for(int i=L,j=1;j<=n;i++,j++){
                sum+=i;
            }

            sum-=L;
            System.out.println(sum);
        }
        else{
            int sum=0;
            if(Math.abs(L)>=n){
                for(int i=L,j=1;j<n;i++,j++){
                    sum+=i;
                }
                System.out.println(sum);
            }
            else {
                for(int i=L,j=1;j<=n;i++,j++){
                    sum+=i;
                }
                System.out.println(sum);
            }
        }
    }
}
