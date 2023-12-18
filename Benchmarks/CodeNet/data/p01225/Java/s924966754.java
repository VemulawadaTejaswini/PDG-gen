import java.util.*;
//import java.lang.Math;
public class Main{
    public static boolean chk(int a,int b,int c,char d,char e,char f){
        if(d!=e || e!=f) return false;
        if(a==b && b==c) return true;
        int B[];
        B=new int[3];
        B[0]=a;
        B[1]=b;
        B[2]=c;
        Arrays.sort(B);
        if(B[2]-B[1]==1 && B[1]-B[0]==1) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int A[];
            char C[];
            String S="";
            A=new int[9];
            for(int j=0;j<9;j++) A[j]=sc.nextInt();
            for(int j=0;j<9;j++){
                String s=sc.next();
                S+=s;
            }
            C=S.toCharArray();
            boolean ans=false;
            int all=(int)Math.pow(3,9);
            for(int j=0;j<all;j++){
                int bit[]=new int[9];
                int now=j;
                for(int k=8;k>=0;k--){
                    bit[k]=now%3;
                    now/=3;
                }
                int cnt[]=new int[3];
                for(int k=0;k<9;k++) cnt[bit[k]]++;
                if(cnt[0]!=3 || cnt[1]!=3 || cnt[2]!=3) continue;
                int one[]=new int[3];
                int two[]=new int[3];
                int three[]=new int[3];
                int plc[]=new int[3];
                for(int k=0;k<9;k++){
                    if(bit[k]==0){
                        one[plc[0]]=k;
                        plc[0]++;
                    }
                    if(bit[k]==1){
                        two[plc[1]]=k;
                        plc[1]++;
                    }
                    if(bit[k]==2){
                        three[plc[2]]=k;
                        plc[2]++;
                    }
                }
                if(chk(A[one[0]],A[one[1]],A[one[2]],C[one[0]],C[one[1]],C[one[2]])){
                    if(chk(A[two[0]],A[two[1]],A[two[2]],C[two[0]],C[two[1]],C[two[2]])){
                        if(chk(A[three[0]],A[three[1]],A[three[2]],C[three[0]],C[three[1]],C[three[2]])) ans=true;
                    }
                }
            }
            System.out.println(ans?"1":"0");
        }
    }
}
