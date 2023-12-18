import java.util.Scanner;

public class Main{
    public static int n,s,count=0;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        while(true){
            n=sc.nextInt();
            s=sc.nextInt();
            if(n==0 && s==0)break;
            count=0;
            dfs(0,0,0);
            System.out.println(count);
        }
    }
    //x:足す数の種類(0~9)　y:合計値  z:足す数の個数
    public static void dfs(int x,int y,int z){
        //条件の達成
        if(y==s && z==n){
            count++;
            return;
        }
        //0~9の探索終了、あるいは足す個数が一定数
        if(x==10 || z==n)return;
        //再帰
        dfs(x+1,y+x,z+1);
        dfs(x+1,y,z);
    }
}
