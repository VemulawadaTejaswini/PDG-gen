import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int w = sc.nextInt();
int n = sc.nextInt();
int[] values = new int[w];
for (int i = 0; i < values.length; i++) {
values[i] = i + 1;
}

for (int i = 0; i < n; i++) {
String str = sc.next();
String[] ab = str.split(",");//文字列を,で分割
int a = Integer.parseInt(ab[0]) - 1;//intに変換
int b = Integer.parseInt(ab[1]) - 1;//分割されているから三文字目だけど二番目になった

int change;

change=values[a];
values[a]=values[b];
values[b]=change;

}

for(int i=0;i<values.length;i++){
System.out.printf("%d\n",values[i]);

}
sc.close();

}

}
