import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w,h,x,y,r,flag=0;
		w = sc.nextInt();
		h = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		
		if(x+r>w)flag=1;
		if(x-r<0)flag=1;
		if(y+r>h)flag=1;
		if(y-r<0)flag=1;
		
		if(flag==0)System.out.println("Yes");
		else System.out.println("No");
	}
}

