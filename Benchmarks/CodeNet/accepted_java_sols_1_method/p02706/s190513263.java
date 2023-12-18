import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int N= scan.nextInt();
        int M= scan.nextInt();
        int[] arr= new int[M];
        int sum=0;
        for(int i=0;i<M;i++){
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        if(N-sum>=0){
            System.out.println(N-sum);
        }
        else{
            System.out.println(-1);
        }

    }
}
