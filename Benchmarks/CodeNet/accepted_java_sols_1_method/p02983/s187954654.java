import java.util.*;
import java.io.*;



public class Main{
    static int INFTY=Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            int L=sc.nextInt();
            int R=sc.nextInt();
            int lShou= L/2019;
            int rShou= R/2019;
            int lJouyo=L%2019;
            int rJouyo=R%2019;
            int ans=INFTY;
            if(lShou!=rShou){
                ans=0;
            }else{
                for(int i=lJouyo;i<rJouyo;i++){
                    for(int j=i+1;j<=rJouyo;j++){
                        ans=Math.min(ans,(i*j)%2019);
                    }
                }
            }
            System.out.println(ans);
    }
}