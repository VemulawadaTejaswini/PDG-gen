import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,k;
		int H,W;
		Scanner sc = new Scanner(System.in);
		while(true){
			H = sc.nextInt();
			W = sc.nextInt();
			if(H==0&&W==0){
				break;
			}
			for(i=0; i<H; i++){
				for(k=0; k<W; k++){
					if(i%2==0){
						if(k%2==0){
							System.out.print('#');
						}
						else{
							System.out.print('.');
						}
					}
					else{
						if(k%2==0){
							System.out.print('.');
						}
						else{
							System.out.print('#');
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}

}