import java.util.*;
public class j1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();

        int i=0,j=0,t=0;
        int c=0;
        while(i<n && j<m && t<=k){

            if(a[i]<=b[j]){
                if(t+a[i]<=k){
                    t+=a[i];
                    i++;
                }else{
                    break;
                }
            }else{
                if((t+b[j])<=k){
                    t+=b[j];
                    j++;
                }
                else{
                    break;
                }
            }
            c++;
        }
        System.out.println(c);

    }

}


