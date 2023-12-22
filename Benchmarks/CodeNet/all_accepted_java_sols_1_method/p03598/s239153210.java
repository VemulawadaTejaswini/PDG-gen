import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int K=scan.nextInt();
        int[] x=new int[N];
        int i;
        int distance=0;
        for(i=0;i<N;i++){
            x[i]=scan.nextInt();
            if(K/2<x[i]){
                distance+=2*Math.abs(K-x[i]);
            }
            else{
                distance+=2*x[i];
            }
        }
        System.out.println(distance);

    }
}