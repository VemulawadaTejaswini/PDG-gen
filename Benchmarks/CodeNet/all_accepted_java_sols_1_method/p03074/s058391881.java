import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        char[] ch=sc.next().toCharArray();
        sc.close();
        int[] s=new int[n];
        int info[][]=new int[n][3];
        int one[]=new int[n];
        int iinfo=0, ione=0;
        int zeros=0, ones=0;
        s[0]=ch[0]=='0'?0:1;
        for(int i=0;i<n;i++){
            if(i<n-1) s[i+1]=ch[i+1]=='0'?0:1;
            //System.out.println("s["+i+"]:"+s[i]);
            if(s[i]==0){
                ones=0;
                zeros++;
                if(i==n-1||s[i+1]==1){
                    info[iinfo][0]=i;
                    info[iinfo][1]=zeros;
                    iinfo++;
                }
                if(i==0){
                    one[ione]=0;
                    ione++;
                }
            }
            else{
                ones++;
                zeros=0;
                if(ones==1){
                    one[ione]=i;
                    ione++;
                }
            }
        }
        // System.out.println("iinfo:"+iinfo);
        // System.out.println("ione:"+ione);
        if(iinfo<=k){
            System.out.println(n);
            System.exit(0);
        }
        int max=0;
        int l,r;
        for(int i=k-1;i<iinfo;i++){
            if(i==iinfo-1) r=ones;
            else r=info[i+1][0]-info[i+1][1]-info[i][0];
            l=info[i][0]-one[i-k+1]+1;
            max=Math.max(max,l+r);
        }
        System.out.println(max);

    }
    
}