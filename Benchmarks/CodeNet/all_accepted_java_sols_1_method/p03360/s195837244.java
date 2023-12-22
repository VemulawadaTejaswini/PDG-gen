import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int max=0;
        int[] x=new int[3];
        int i;
        for(i=0;i<3;i++){
            x[i]=scan.nextInt();
            if(max<x[i]){
                max=x[i];
            }
        }
        int K=scan.nextInt();
        int sum=0;
        for(i=0;i<K;i++){
            for(int j=0;j<3;j++){
                if(x[j]==max){
                    x[j]*=2;
                    max=x[j];
                }
            }
        }
        for(i=0;i<3;i++){
            sum+=x[i];
        }
        System.out.println(sum);
    }
}