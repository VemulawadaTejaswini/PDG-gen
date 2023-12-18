import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
String line =sc.nextLine();
String[]a=line.split(" ",0);
int []n=new int[2];
for(int i=0;i<2;i++){
n[i]=Integer.parseInt(a[i]);
}
if(n[1]<9&&n[0]<9){
System.out.println("Yay!");
}
else System.out.println(":(");
}
}