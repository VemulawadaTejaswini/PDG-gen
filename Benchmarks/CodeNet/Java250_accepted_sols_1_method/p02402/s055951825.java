import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int b=scan.nextInt();
long min=1000000,max=-10000000,sum=0;
for(int a=0;a<b;a++){
int c=scan.nextInt();
if(min>c)
min=c;
if(max<c)
max=c;
sum=sum+c;
}
System.out.println(min+" "+max+" "+sum);
}
}