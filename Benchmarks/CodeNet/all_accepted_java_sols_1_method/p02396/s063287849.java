import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a[]=new int[10001];
int x=0;
do{
a[x]=scan.nextInt();
if(a[x]==0)break;
x++;
}while(true);
x=0;
do{
if(a[x]==0)break;
System.out.println("Case "+(x+1)+": "+a[x]);
x++;
}while(true);
}
}