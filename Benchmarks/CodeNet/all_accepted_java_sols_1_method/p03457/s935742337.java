import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int N=sc.nextInt();
int[] t=new int[N+1];
int[] x=new int[N+1];
int[] y=new int[N+1];
t[0]=0;
x[0]=0;
y[0]=0;
for(int i=1;i<=N;i++){
    t[i]=sc.nextInt();
    x[i]=sc.nextInt();
    y[i]=sc.nextInt();
}

//入力値変換


//出力変数
String ans="Yes";

//計算
for(int i=0;i<N;i++){
    if(t[i+1]-t[i]<Math.abs(x[i]-x[i+1])+Math.abs(y[i]-y[i+1])){
        ans="No";
    }
    if((t[i]+t[i+1]+x[i]+y[i]-x[i+1]-y[i+1])%2!=0){
        ans="No";
    }
}
//出力
System.out.println(ans);

}}