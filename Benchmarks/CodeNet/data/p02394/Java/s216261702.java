import java.util.Scanner;
	class Main{
//PCK2006 0136
		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
int W;
int H;
int x;
int y;
int r;
boolean a;
a=false;

W=sc.nextInt();
H=sc.nextInt();
x=sc.nextInt();
y=sc.nextInt();
r=sc.nextInt();

if(x+r<=H&&y+r<=W){
	if(x+r>=0&&y+r>=0){
		System.out.println("Yes");
		
	}
}else{
	System.out.println("No");
}
	
	}
	}