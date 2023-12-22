import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//入力変数
int N = sc.nextInt();
int a[] = new int[N];
for(int i = 0;i<N;i++){
a[i]=sc.nextInt();
}

//入力値変換
boolean order = false;
int tempofa = 0;
int change =0;
for(;order == false;){
change = 0;
for(int i = 0;i<N-1;i++){
if(a[i]<a[i+1]){
tempofa=a[i];
a[i] = a[i+1];
a[i+1]=tempofa;
change++;
}}
if(change == 0){
order = true;
}}


//出力変数
int ans=0;

//計算
for(int i = 0;i<N;i++){
ans += Math.pow(-1,i)*a[i];
}

//出力
System.out.println(ans);

}
}
