import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int head = sc.nextInt();
		int leg = sc.nextInt();
		int count = 0;
while(count < head){
		while (4 <= leg){
			leg = leg-4;
			count++;
		}
		while(2 <= leg){
			leg = leg-2;
			count++;
		}
		if(count < head){
			count = count-1;
			leg =4;
		}
		while(2 <= leg){
			leg = leg-2;
			count++;
		}
	}

		if(count == head){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}