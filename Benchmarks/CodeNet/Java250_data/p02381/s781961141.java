import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       while(true){
        int n = sc.nextInt();
        if(n==0)break;
        int []array=new int [n];
        double sum=0,S=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        double ave=(double)sum/n;
        for(int i=0;i<n;i++){
            S+=(double)Math.pow(array[i]-ave,2);
        }
        S=(double)S/n;
        S=(double)Math.sqrt(S);
        System.out.println(S);
       }
    }
}
