import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int p=1,c=1,n=1,r=1;
        int k=0;
        int[] ans = new int[10000];
        int[] part = new int[50];
        while(true){
            n = scan.nextInt();
            r = scan.nextInt();
            if(n==0 && r==0)break;
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i]=i+1;
            }
            for(int j=0;j<r;j++){
                p = scan.nextInt();
                c = scan.nextInt();
                for(int i=0;i<c;i++){
                    part[i]=num[n-p+1-c+i];
                }
                for(int i=0;i<p-1;i++){
                    num[i+n-p-c+1]=num[i+n-p+1];
                }
                
                for(int i=0;i<c;i++){
                    num[i+n-c]=part[i];
                }
            }
            ans[k]=num[n-1];
            k++;
        }
        for(int i =0;i<k;i++){
            System.out.println(ans[i]);
        }
    }
}
