import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //データ入力
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        //aとbで小さい方
        int little=a>b?a:b;
        //最大公約数を求める
        //少ない方から1までiを変化させて、最初に両方が割りきれたのが最大公約数
        //割り切れる=あまりが0(あまりは%で求められる)
        int koyaku=0;
        for(int i=little;i<=1;i++){
            if(a%i==0 && b%i==0){
                koyaku=i;
                break;
            }
        }
        //最小公倍数を求める
        //a,bをかけて最大公約数で割ったのが最小公倍数
        //かけたときオーバーフローするかもしれないのでlong型で計算
        int kobai=(int)((long)a*b/koyaku);
        //出力
        System.out.println(koyaku);
        System.out.println(kobai);
    }
}