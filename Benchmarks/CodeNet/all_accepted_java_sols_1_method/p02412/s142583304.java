import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int[] A=new int[101];
int a=0;
while(true){
String x=scan.next();
String y=scan.next();
int n=Integer.parseInt(x);
int m=Integer.parseInt(y);
if(n==0&&m==0)
break;
int sum=0;
for(int i=1;i<=n;i++){
for(int j=i+1;j<=n;j++){
for(int k=j+1;k<=n;k++){
if(i+j+k==m)
sum++;
}
}
}
A[a]=sum;
a++;
}
for(int z=0;z<a;z++)
System.out.println(A[z]);
}
}