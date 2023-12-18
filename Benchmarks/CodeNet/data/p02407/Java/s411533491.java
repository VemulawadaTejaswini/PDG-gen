import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int[] c=int[101];
for(int b=0;b<a;b++){
c[b]=scan.nextInt();
}
for(int e=a-1;e>=0;e++){
Sysytem.out.println(c[e]);
}
}
}