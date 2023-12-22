import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,k;
		int n;
		String mark;
		int number;
		int[][] data = new int[4][13];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=0; i<4; i++){
			for(k=0; k<13; k++){
				data[i][k]=1;
			}
		}
		for(i=0; i<n; i++){
			mark = sc.next();
			number = sc.nextInt();
			if(mark.equals("S")){
				data[0][number-1] = 0;
			}
			else if(mark.equals("H")){
				data[1][number-1] = 0;
			}
			else if(mark.equals("C")){
				data[2][number-1] = 0;
			}
			else{
				data[3][number-1] = 0;
			}
		}
		for(i=0; i<4; i++){
			for(k=0; k<13; k++){
				if(data[i][k]==1){
					if(i==0){
						System.out.println("S " + (k+1));
					}
					else if(i==1){
						System.out.println("H " + (k+1));
					}
					else if(i==2){
						System.out.println("C " + (k+1));
					}
					else{
						System.out.println("D " + (k+1));
					}
				}
			}
		}

	}

}