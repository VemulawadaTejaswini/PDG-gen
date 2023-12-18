import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
int d=0;
int w=0;
int h=0;
int n=0;
double t;
int men;
men=w*d;
int l = 0;
for(;l!=9;){

d=sc.nextInt();
w=sc.nextInt();
h=sc.nextInt();
n=sc.nextInt();
if(d==0){
	if(w==0){
		if(h==0){
	System.exit(0);
		}
	}
}

int r[]=new int[n];
for(int i=0;i<n;i++){
	r[i]=sc.nextInt();
	t=r[i]*Math.sqrt(2);
if(t>=men){
	System.out.println("OK");
}else if(t<men){
	System.out.println("NA");
	
}
}
	
	
}

	}
	}