import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
int W;
int H;
int x;
int y;
int r;
int flag=9;

W=sc.nextInt();
H=sc.nextInt();
x=sc.nextInt();
y=sc.nextInt();
r=sc.nextInt();

if((x-r)>=0 && (x+r)<=W){
	if((y-r)>=0 && (y+r)<=H){
		flag = 0;
	}
}

if(flag==0){
	System.out.println("Yes");
} else {
	System.out.println("No");
}

	}
	}