import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
long N=sc.nextInt();
long K=sc.nextInt();

//入力値変換


//出力変数
long ans=0;

//計算
long quo=0;
long rem=0;
if(K==0){
    ans=N*N;
}else{
for(long b=K+1;b<=N;b++){
    quo=N/b;
    rem=N%b;
    ans+=quo*(b-K)+Math.max(rem+1-K,0);
}
}

//出力
System.out.println(ans);

}}
