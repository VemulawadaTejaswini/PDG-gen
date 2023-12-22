import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] d=new int[N];
        int mid=0;
        int max=0;
        int min=100000;
        for(int i=0;i<N;i++){
            d[i]=sc.nextInt();
            mid+=d[i];
            if(d[i]>max){
                max=d[i];
            }
            if(d[i]<min){
                min=d[i];
            }
        }
        int[] e=d;
        Arrays.sort(e);

        mid=e[N/2-1];
        int count=0;










        System.out.println(e[N/2]-e[N/2-1]);






    }
}
