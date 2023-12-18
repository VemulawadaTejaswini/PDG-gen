import java.util.*;
public class Main{
Scanner sc = new Scanner(System.in);
void run(){
for(;;){int h=sc.nextInt();
int w=sc.nextInt();
if(h+w==0)
break;int[][]fl=new int[h+1][w+1];int[][]ft=new int[h+1][w+1];
int m=0;
for(int i=1;i<=h;i++){
char[]c=("*"+sc.next()).toCharArray();for(int j=1;j<=w;j++){fl[i][j]=fl[i][j-1]+1;
if(c[j]=='*')
fl[i][j] = 0;ft[i][j]=fl[i][j];for(int k=0;k<i;k++)ft[k][j]=Math.min(ft[k][j],fl[i][j]);for(int k=0;k<=i;++)m=Math.max(max,ft[k][j]*(i-k+1));
}}System.out.println(m);
}}public static void main(String[] a){
Main m=new Main();
m.run();
}
}