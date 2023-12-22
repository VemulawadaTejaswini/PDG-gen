import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
int b=scan.nextInt();
int[] c;
c =new int[10001];

for(int a=3;a<=b;a++){
int d=a;
if(d%3==0)
	c[a]=1;
else
	c[a]=0;
while(true){
	if(d%10==3){
		
		c[a]=1;
		break;
	}
d=d/10;
if(d==0)
	break;

}
}
for(int i=3;i<=b;i++){
	if(c[i]==1)
		System.out.print(" "+i);
}
System.out.println();
}
}