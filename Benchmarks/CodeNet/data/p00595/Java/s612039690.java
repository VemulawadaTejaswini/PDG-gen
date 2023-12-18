import java.util.Scanner;

class Main{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
while(sc.hasNext()){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int x=Math.max(a, b);
	int y=Math.min(a, b);
	int temp;
	for(;;){
	temp=y;y=x%y;x=temp;if(y==0)break;
	}
	System.out.println(x);
}
    }
}