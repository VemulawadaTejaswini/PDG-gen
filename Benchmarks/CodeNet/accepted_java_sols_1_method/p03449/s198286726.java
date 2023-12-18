import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int N=sc.nextInt();
int[][] A=new int[2][N];
for(int i=0;i<N;i++){
    A[0][i]=sc.nextInt();
}
for(int i=0;i<N;i++){
    A[1][i]=sc.nextInt();
}

//入力値変換

//出力変数
int ans;

//計算
int tempofans=0;
int num=0;

for(int k=0;k<N;k++){
    num=0;
    for(int j=0;j<N;j++){
        if(j<=k){
            num+=A[0][j];
        }
        if(j>=k){
            num+=A[1][j];
        }
    }
    if(num>tempofans){
        tempofans=num;
    }
}
ans = tempofans;

//出力
System.out.println(ans);

}}