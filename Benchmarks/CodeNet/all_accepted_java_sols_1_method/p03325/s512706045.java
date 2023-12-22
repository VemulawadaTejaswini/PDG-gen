import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
String b=sc.nextLine();
int a=Integer.parseInt(b);
String line=sc.nextLine();
String s[]=line.split(" ",0);
int iti[]=new int[a];
for(int i=0;i<a;i++){
iti[i]=Integer.parseInt(s[i]);
}
int ans=0;
for(int i=0;i<a;i++){
while((iti[i]/2)*2==iti[i]){
ans++;
iti[i]/=2;
}
}
System.out.println(ans);
    }
}