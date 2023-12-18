	import java.util.Scanner;
public class Main {
	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
		int W=sc.nextInt(),H=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),r=sc.nextInt();
	if(x-r>=0&&y-r>=0&&x+r<=H&&y+r<=H)
		{System.out.println("Yes");}
	 else {System.out.println("No");}
}
}