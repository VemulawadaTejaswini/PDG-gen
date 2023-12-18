import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int sumA = 0;
		int sumB = 0;
		for(int i=0;i<4;i++)sumA += stdIn.nextInt();
		for(int j=0;j<4;j++)sumB += stdIn.nextInt();
		if(sumA >= sumB)System.out.println(sumA);
		else if(sumA < sumB)System.out.println(sumB);
	}
}