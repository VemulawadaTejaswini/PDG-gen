import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int a=sc.nextInt();
int b=sc.nextInt();

//入力値変換
int x;
if(b<10){
    x=10*a+b;
}else if(b<100){
    x=100*a+b;
}else{
    x=1000*a+b;
}

//出力変数
String ans="No";

//計算
for(int i=0;i<x;i++){
    if(i*i==x){
        ans="Yes";
    }
}

//出力
System.out.println(ans);

}}