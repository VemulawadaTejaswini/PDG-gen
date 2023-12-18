import java.util.Scanner;
public class Main {
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int n,x,y;
long min = min,max,sum;
n=sc.nextInt();
x=sc.nextInt();
sum=x;
max=x;
for(int i=0;i<n-1;i++){
	y=sc.nextInt();
	if(max<y)
		max=y;
	if(min>y)
		min=y;
	sum+=y;
}
System.out.print(min+" ");
System.out.print(max+" ");
System.out.println(sum);

sc.close();

}

}
