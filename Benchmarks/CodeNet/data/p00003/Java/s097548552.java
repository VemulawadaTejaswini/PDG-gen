import java.util.Arrays;
import java.util.Scanner;;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	final int NUM = scan.nextInt();
    	int[] side = new int[3];
    	try {
			for(int i = 0; i < NUM; i++){
				for(int j = 0; j < 3; j++){
					side[j] = scan.nextInt();
				}
				Arrays.sort(side);
				if(side[2]*side[2] == side[0]*side[0] + side[1]*side[1]){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
		}
    }
}