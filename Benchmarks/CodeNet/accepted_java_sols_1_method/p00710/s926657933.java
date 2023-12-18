import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,r,i,j,p,c;
        int[] yama,temp;
        yama = new int[50];
        temp = new int[50];

        while(true){
            n=scan.nextInt();
            r=scan.nextInt();
            if(n==0 && r==0){
                break;
            }

            for(i=0;i<n;i++){
                yama[i]=n-i;    //上から数える
            }

            for(i=0;i<r;i++){
                p=scan.nextInt();
                c=scan.nextInt();

                for(j=0;j<c;j++){
                    temp[j]=yama[j+p-1];
                }
                for(j=c;j<p-1+c;j++){
                    temp[j]=yama[j-c];
                }
                for(j=0;j<p-1+c;j++){
                    yama[j]=temp[j];
                }
            }
            
            System.out.println(yama[0]);
        }

    }
}
