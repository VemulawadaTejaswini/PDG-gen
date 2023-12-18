import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        while(true){
            int n=sc.nextInt();
            int r=sc.nextInt();
            if(n==0 && r==0){
                break;
            }
            int[] hana = new int[n];
            for(i=0;i<n;i++){
                hana[i]=n-i;
            }
            for(j=0;j<r;j++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                int[] stock=new int[c+p-1];
                for(i=0;i<c;i++){
                    stock[i]=hana[p-1+i];
                }
                for(i=c;i<p+c-1;i++){
                    stock[i]=hana[i-c];
                }
                for(i=0;i<p+c-1;i++){
                    hana[i]=stock[i];
                }
            }
            System.out.println(hana[0]);
        }
        sc.close();

    }
}
