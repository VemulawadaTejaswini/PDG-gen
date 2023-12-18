import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
		while(cin.hasNext()){
			int[] a = new int[4];
			int[] b = new int[4];
			for(int i = 0; i < 4;i++){
				a[i]=cin.nextInt();
			}
			for(int i = 0; i < 4;i++){
				b[i]=cin.nextInt();
			}
			int hit=0, blow=0;
			for(int i = 0; i < 4;i++){
				for(int j = 0; j < 4;j++){
					if(a[i]==b[j]){
						if(i==j){
							hit++;
						}
						else{
							blow++;
						}
					}
					
				}
			}
			System.out.println(hit + " " + blow);
		}
	}

}