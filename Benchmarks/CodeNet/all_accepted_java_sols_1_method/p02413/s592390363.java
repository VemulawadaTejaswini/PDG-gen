import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int[][] n=new int[101][101];
int[] tate=new int[101];
int[] yoko=new int[101];

int sum=0;
int x=scan.nextInt();
int y=scan.nextInt();
for(int i=0;i<x;i++){
tate[i]=0;
yoko[i]=0;
}
for(int i=0;i<x;i++){
for(int j=0;j<y;j++){
n[i][j]=scan.nextInt();
tate[j]+=n[i][j];
yoko[i]+=n[i][j];
sum+=n[i][j];
}
}
for(int i=0;i<x+1;i++){
for(int j=0;j<y;j++){
if(i!=x){
System.out.print(n[i][j]);
System.out.print(" ");
if(j==y-1)
System.out.println(yoko[i]);
}
else
System.out.print(tate[j]+" ");
}
}
System.out.println(sum);

}
}