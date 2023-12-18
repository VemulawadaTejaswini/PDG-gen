import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n_max = 999999;
        boolean hurui[] = new boolean[1000000];
        for(int i=0;i<1000000;i++) {
            hurui[i] = true;
        }
        for(int i=2;i<n_max;i++){
            if(hurui[i]){
                for(int j = i*2; n_max > j; j+=i){
                    hurui[j]=false;
                }
            }
        }
        int sum[] = new int[1000000];
        sum[2]=1;
        for(int i=3;i<1000000;i++)
            sum[i]=sum[i-1]+((hurui[i])?1:0);
        Scanner scaned = new Scanner(System.in);
        while(scaned.hasNextInt()) {
            int end = scaned.nextInt();
            System.out.println(sum[end]);
        }
    }
}