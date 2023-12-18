import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			
			
			int[] mods = new int[q];
			Arrays.fill(mods, -1);
			
			int cur = p * 10;
			int rep_start = -1;
			int rep_end = 0;
			boolean is_f = true;
			int first = 0;
			
			while(true){
				final int m = cur % q;
				
				if(is_f && cur /q == 0){
					first++;
				}else{
					is_f = false;
				}
				
				if(m == 0){
					rep_end = -1;
					System.out.print(cur / q);
					break;
				}else if(mods[m] >= 0){
					if(mods[m] <= first){
						if((int)(p * Math.pow(10, mods[m] + 1)) == cur){
							rep_start = mods[m];
							rep_end--;
							break;
						}else{
							mods[m] = rep_end;
						}
					}else{
						rep_start = mods[m];
						rep_end--;
						break;
					}
				}else{
					mods[m] = rep_end;
				}
				
				System.out.print(cur / q);
				rep_end++;
				cur = m * 10;
			}
			
			System.out.println();
			if(rep_end != -1){
				for(int i = 0; i <= rep_end;i++){
					if(i < rep_start){
						System.out.print(" ");
					}else{
						System.out.print("^");
					}
				}
				System.out.println();
			}
		}

	}

}