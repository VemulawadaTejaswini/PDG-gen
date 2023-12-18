import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int a[3]=new int[3],t,n;
n=in.nextInt();
while(n--){
a[0]=in.nextInt();a[1]=in.nextInt();a[2]=in.nextInt();
for(int i=0;i<2;i++){
if(a[i]<a[i+1]){t=a[i];a[i]=a[i+1];a[i+1]=t;}
}
if(a[0]<a[1]){t=a[0];a[0]=a[1];a[1]=t;}
if(a[0]*a[0]==a[1]*a[1]+a[2]*a[2])System.out.println("YES");
else System.out.println("NO");
}
}
}