import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int one = sc.nextInt();
			if(one == 0){
				break;
			}
			
			final int two = sc.nextInt();
			final int three = sc.nextInt();
			final int four = sc.nextInt();
			final int five = sc.nextInt();
			
			int[] hands = new int[4];
			hands[one]++;
			hands[two]++;
			hands[three]++;
			hands[four]++;
			hands[five]++;
			
			int count = 0;
			int first = -1;
			int second = -1;
			for(int i = 1; i < 4; i++){
				if(hands[i] != 0){
					if(first == -1){
						first = i;
					}else if(second == -1){
						second = i;
					}
					count++;
				}
			}
			
			if(count == 3 || count == 1){
				for(int i = 0; i < 5; i++){
					System.out.println(3);
				}
			}else{
				if(first == 1 && second == 3){
					first = 3;
					second = 1;
				}
				
				System.out.println(one == first ? 1 : 2);
				System.out.println(two == first ? 1 : 2);
				System.out.println(three == first ? 1 : 2);
				System.out.println(four == first ? 1 : 2);
				System.out.println(five == first ? 1 : 2);
			}
		}
		
	}

}