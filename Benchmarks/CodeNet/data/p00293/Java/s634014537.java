import java.util.*;

class Main{
    int a,b;
    int n,m;
    int [][] flg = new int[24][60];

    Main(){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            flg[a][b]=1;
        }
        m=sc.nextInt();
        for(int i=0;i<m;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            flg[a][b]=1;
        }
        int cnt=0;
        for(int i=0;i<24;i++){
            for(int j=0;j<60;j++){
                if(flg[i][j]==0)continue;
                cnt++;
                if(cnt>1)System.out.print(" ");
                System.out.print(i+" "+j/10+j%10);                
            }
        }
        System.out.println();

    }

    public static void main(String[] args){
        new Main();
    }
}