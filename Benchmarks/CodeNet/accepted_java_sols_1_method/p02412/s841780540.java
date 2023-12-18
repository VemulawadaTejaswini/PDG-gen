import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){

			//数字の数と、組み合わせで作る数字の入力
			int howManyNumber = scan.nextInt();
			int createNumber = scan.nextInt();
			//組み合わせたものの和
			int combination = 0;
			//成立した組み合わせの数
			int count = 0;

			//ともに０の時に終了
			if(howManyNumber == 0 && createNumber == 0){
				break;
			}

			for(int num1 = 1 ;num1 <= howManyNumber ;num1++){
				for(int num2 = 2 ;num2 <= howManyNumber ;num2++){
					for(int num3 = 3 ;num3 <= howManyNumber ;num3++){
						//数字の相対的な大きさ決めを重複をはじく
						if(num1 < num2 && num2 < num3){
							combination = num1 + num2 + num3;
							if(createNumber == combination){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}

