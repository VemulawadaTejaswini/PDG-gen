import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] leftABCD = new int[4];
		int[] rightABCD = new int[4];
		while(stdIn.hasNext()){
			float temp = stdIn.nextFloat();
			if(1.1 <= temp){
				leftABCD[0]++;
			}else if(0.6 <= temp & temp < 1.1){
				leftABCD[1]++;
			}else if(0.2 <= temp & temp < 0.6){
				leftABCD[2]++;
			}else if(temp < 0.2){
				leftABCD[3]++;
			}
			temp = stdIn.nextFloat();
			if(1.1 <= temp){
				rightABCD[0]++;
			}else if(0.6 <= temp & temp < 1.1){
				rightABCD[1]++;
			}else if(0.2 <= temp & temp < 0.6){
				rightABCD[2]++;
			}else if(temp < 0.2){
				rightABCD[3]++;
			}
		}
		for(int i = 0; i < 4;i++){
			System.out.println(leftABCD[i] + " " + rightABCD[i]);
		}
	}
}