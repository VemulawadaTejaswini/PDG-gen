import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int[] kingaku = new int [4];
	int n;
	
	public void syurui(){
		
		for(n = 0;n <= 3;n++){
		
		int syurui = sc.nextInt();
		int maisu = sc.nextInt();
		int kane;

		switch(syurui){
			case 1:
				kane = 2000;
				kingaku[n] = kane * maisu;
				break;
			case 2:
				kane = 3000;
				kingaku[n] = kane * maisu;
				break;
			case 3 :
				kane = 4000;
				kingaku[n] = kane * maisu;
				break;
			case 4 :
				kane = 6000;
				kingaku[n] = kane * maisu;
				break;
		}
		}
	}
	public void hyouji(){
		for(n = 0;n <= 3;n++){
			System.out.println(kingaku[n]);
		}
	}
	public static void main(String[] args) {
		Main toi = new Main();
		toi.syurui();
		toi.hyouji();
		
	}

}