import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] money = {500,100,50,10,5,1};
		while(scan.hasNext()){
			int ch = scan.nextInt();
			if(ch == 0){
				break;
			}
			ch = 1000 - ch;
			int count = 0;
			for(int i = 0;i < 6;i++){
				while(ch >= money[i]){
					ch -= money[i];
					count++;
				}
			}
			System.out.println(count);
		}
	}
}