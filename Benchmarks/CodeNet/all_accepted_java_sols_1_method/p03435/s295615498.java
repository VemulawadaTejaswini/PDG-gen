import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//入力変数
int c[] = new int[9];
for(int i = 0;i<9;i++){
c[i]=sc.nextInt();
}

//入力値変換

//出力変数
String ans;

//計算
if(
c[0]-c[1]==c[3]-c[4]&&
c[0]-c[1]==c[6]-c[7]&&
c[2]-c[1]==c[5]-c[4]&&
c[2]-c[1]==c[8]-c[7]&&
c[0]-c[3]==c[1]-c[4]&&
c[0]-c[3]==c[2]-c[5]&&
c[4]-c[7]==c[3]-c[6]&&
c[5]-c[8]==c[3]-c[6]
){
ans="Yes";
}else{
ans="No";
}

//出力
System.out.println(ans);

}
}
