import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] ant = new int[5];
		for(int i = 0; i < 5; i++) {
			ant[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		boolean isCom = true;
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				if(Math.abs(ant[i] - ant[j]) > k) {
					isCom = false;
				}
			}
		}
		System.out.println(isCom ? "Yay!" : ":(");
	}
}
