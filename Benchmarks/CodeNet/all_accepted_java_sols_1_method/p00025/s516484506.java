import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			int[] a = new int[4];
			int[] b = new int[4];
			for(int i = 0;i < a.length; i++){
				a[i] = stdIn.nextInt();
			}
			for(int i = 0;i < b.length; i++){
				b[i] = stdIn.nextInt();
			}
			int hitCount = 0;
			for(int i = 0;i < 4; i++){
				if(a[i] == b[i]){
					hitCount++;
				}
			}
			int blowCount = 0;
			for(int i = 0;i < a.length; i++){
				for(int j = 0;j < b.length; j++){
					if(a[i] == b[j] & i != j){
						blowCount++;
					}
				}
			}
			System.out.println(hitCount + " " + blowCount);
		}
	}
}