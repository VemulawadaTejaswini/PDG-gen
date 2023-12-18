import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        int p,n,r,c,i,j,k;
        int[] card = new int[51];
        int[] dummy = new int[51];
        Scanner s = new Scanner(System.in);
        while(true){
            n = s.nextInt();
            r = s.nextInt();
            if(n==0&&r==0)break;
            for(i=0;i<n;i++)card[i]=n-i;
            for(i=0;i<r;i++){
                p = s.nextInt();
                c = s.nextInt();
                for(j=0;j<p-1;j++)dummy[j]=card[j];
                for(j=0;j<c;j++)card[j]=card[j+p-1];
                for(j=0;j<p-1;j++)card[j+c]=dummy[j];
            }
            System.out.println(card[0]);
        }
    }
}


