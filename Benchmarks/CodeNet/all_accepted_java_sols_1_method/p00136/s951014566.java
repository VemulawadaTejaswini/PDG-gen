import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		
		int[] count= new int[6];
		for(int i = 0;i<N;i++){
			double d = cin.nextDouble();
			if(d < 165.0){
				count[0]++;
			}
			else if(d < 170.0){
				count[1]++;
			}
			else if(d < 175.0){
				count[2]++;
			}
			else if(d < 180.0){
				count[3]++;
			}
			else if(d < 185.0){
				count[4]++;
			}
			else{
				count[5]++;
			}
		}
		for(int i = 0;i<6;i++){
			System.out.print((i+1)+":");
			for(int j=0;j<count[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}