import java.util.Scanner;


public class Main {
	static void lnJudge(char a, boolean ln){
		if(ln == true){
			System.out.println(a);
		}else{
			System.out.print(a);			
		}
	}
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0){
				break;
			}
			
			for(int i = 0; i < H; i++){
				char p;
				if(i == 0 || i == H -1){
					p = '#';
				}else{
					p = '.';
				}
				for(int j = 0; j < W; j++){
					if(j == W -1){
						lnJudge('#', true);
					}else if(j == 0){
						lnJudge('#', false);
					}
					else{
						lnJudge(p, false);
					}
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}