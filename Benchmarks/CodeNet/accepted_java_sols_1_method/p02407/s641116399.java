import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N;
        N=sc.nextInt();

        int num[]=new int[N];

        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){

            System.out.print(num[N-i-1]);
            if (i!=N-1) {
                System.out.print(" ");
            }else{
                System.out.println("");
            }
        }



        sc.close();
    }
}
