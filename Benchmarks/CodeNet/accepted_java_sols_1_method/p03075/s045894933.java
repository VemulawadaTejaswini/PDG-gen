import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 124;
		for(int i = 0; i < 5; i++){
			int antena = sc.nextInt();
			if(antena > max){
				max = antena;
			}
			if(antena < min){
				min = antena;
			}
		}
		int k = sc.nextInt();
		if(max - min <= k){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}
}