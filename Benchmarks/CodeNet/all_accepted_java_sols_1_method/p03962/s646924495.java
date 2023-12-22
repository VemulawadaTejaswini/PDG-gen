import java.util.Scanner;
class Main{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int ans=1;
if (a!=b) {
	ans++;	
}
if(c!=b&&c!=a) {
	ans++;
}
System.out.println(ans);
 }
  }