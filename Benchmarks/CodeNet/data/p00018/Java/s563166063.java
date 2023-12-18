import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
long a;
long b;
long c;
long d;
long e;
int median;
long num[]=new long[6];
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();

num[0]=a;
num[1]=b;
num[2]=c;
num[3]=d;
num[4]=e;
num[5]=e;

for(int i=0;i<5;i++){
	for(int j=1;j<i-1;j++){
		if(num[i]<num[j]){
			int taihi;
			num[5] = num[j];
			num[j]=num[i];
			num[i]=num[5];
		}
	}
}
System.out.println(num[4]+" "+num[3]+" "+num[2]+" "+num[1]+" "+num[0]);


	}
	}