import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int kingaku;
	int[] goukei = new int[4];
	int n;
	
	public void syurui(){
		
		for(n=0;n<=3;n++){
		int syurui = sc.nextInt();
		int maisuu = sc.nextInt();
		
			switch (syurui){
				case 1: kingaku = 6000;break;
				case 2: kingaku = 4000;break;
				case 3: kingaku = 3000;break;
				case 4: kingaku = 2000;break;
			}	
			
		goukei[n] = kingaku * maisuu;
		}
	}
	
	public void hyouji(){
		for(n=0;n<=3;n++){
			System.out.println(goukei[n]);
		}
		
	}
	
	public static void main(String[] args) {
       Main uriage= new Main();
      uriage.syurui();
       uriage.hyouji();
       
       
   }
}