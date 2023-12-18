//package  com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,w,k;
        h=sc.nextInt();
        w=sc.nextInt();
        k=sc.nextInt();
        sc.nextLine();
        //int[][] mat=new int[h][w];
        String[] mat=new String[h];
        for(int i=0;i<h;++i){
            mat[i]=sc.nextLine();

            //System.out.println(s);
        }
        //generate all subsets now
        int ans=0;
        for(int maskrow=0;maskrow<(1<<h);maskrow++){
            for(int maskcol=0;maskcol<(1<<w);maskcol++){
                int cnt=0;
                for(int i=0;i<h;++i){
                    for(int j=0;j<w;++j){
                        if( (maskrow&(1<<i))>0 || (maskcol&(1<<j))>0)continue;
                        cnt+=(mat[i].charAt(j)=='#')?1:0;
                    }
                }
                if(cnt==k)ans++;
            }
        }
        System.out.println(ans);

    }
}