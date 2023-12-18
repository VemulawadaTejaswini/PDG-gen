import java.util.Scanner;
class Main{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int W=sc.nextInt();
	int H=sc.nextInt();
	int x=sc.nextInt();
	int y=sc.nextInt();
	int r=sc.nextInt();
	int top=r+y;
	int down=y-r;
	int right=x+r;
	int left=x-r;
	if(top>W||down<0||right>H||left<0)
	    System.out.println("Yes");
	else System.out.println("No");
	
    }
}