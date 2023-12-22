import java.util.Scanner;

public class Main {

	static int[][] days = new int[13][32];
	static int youbi = 3;
	static{
		for(int i = 1; i <= 12; i++){
			if(i==2){
				for(int j = 1;j <= 29 ;j++){
					days[i][j] = youbi++%7;				
				}
			}
			else if(i==4||i==6||i==9||i==11){
				for(int j = 1;j <= 30; j++){
					days[i][j] = youbi++%7;				
				}
			}
			else{
				for(int j = 1;j <= 31; j++){
					days[i][j] = youbi++%7;				
				}
			}
				
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String[] yo = { "Monday", "Tuesday", "Wednesday", "Thursday"
				, "Friday", "Saturday", "Sunday"};
		
		while(true){
			int a = cin.nextInt();
			int b = cin.nextInt();
			if(a+b==0){
				break;
			}
			System.out.println(yo[days[a][b]]);
			
		}
	}

}