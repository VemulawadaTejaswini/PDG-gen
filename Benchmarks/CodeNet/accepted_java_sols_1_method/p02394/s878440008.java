import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int W=cin.nextInt(),H=cin.nextInt(),x=cin.nextInt(),y=cin.nextInt(),r=cin.nextInt();
		
		if(x-r>=0 && x+r<=W && y-r>=0 && y+r<=H)System.out.println("Yes");
		else System.out.println("No");
	}

}

