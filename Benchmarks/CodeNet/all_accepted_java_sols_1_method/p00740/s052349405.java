import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int p = sc.nextInt();
			
			if(n == 0 && p == 0){
				break;
			}
			
			int[] hands = new int[n];
			
			int cur_person = 0;
			int cur_stone = p;
			
			while(true){
				if(cur_stone == 0){
					cur_stone = hands[cur_person];
					hands[cur_person] = 0;
				}else{
					cur_stone--;
					hands[cur_person]++;
					
					if(cur_stone == 0 && hands[cur_person] == p){
						System.out.println(cur_person);
						break;
					}
				}
				
				cur_person = (cur_person + 1) % n;
			}
		}
		
		sc.close();
	}

}