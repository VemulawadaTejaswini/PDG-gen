import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		while(scan.hasNext()){
			int hit = 0;
			int blow = 0;
			int[] aNums = new int[4];
			int[] bNums = new int[4];
			for(int i = 0; i < 4; i++){
				aNums[i] = scan.nextInt();
			}
			for(int i = 0; i < 4; i++){
				bNums[i] = scan.nextInt();
			}
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(aNums[i] == bNums[j]){
						if(i == j){
							hit++;
						} else{
							blow++;
						}
					}
				}
			}
			System.out.printf("%d %d\n", hit, blow);
		}
	}
}