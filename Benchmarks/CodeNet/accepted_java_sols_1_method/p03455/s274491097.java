import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int a=sc.nextInt();
int b=sc.nextInt();

//入力値変換


//出力変数
String ans;

//計算
if(a%2==1&&b%2==1){
    ans="Odd";
}else{
    ans="Even";
}

//出力
System.out.println(ans);

}}