import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int N = sc.nextInt();
			if(N == 0) break;
			int counter = 0;
			int[] number = new int[N];
		
			System.out.println(N);
			for(int i = 0; i < N; i++){
				number[i] = sc.nextInt();
			}
		
			while(true){
				int[] hindo = createHindo(number);
				counter++;
				if(isSame(hindo,number)){
					write(hindo,counter - 1);
					break;
				}else{
					number = hindo;
				}
			}
		}
	}
	
	public static int[] createHindo(int[] number){
		int[] returnValue = new int[number.length];
		for(int i = 0; i < number.length; i++){
			int counter = 0;
			for(int j = 0; j < number.length; j++){
				if(number[i] == number[j]){
					counter++;
				}
			}
			returnValue[i] = counter;
		}
		return returnValue;
	}
	
	public static boolean isSame(int[] hindo,int[] number){
		for(int i = 0; i < hindo.length; i++){
			if(hindo[i] != number[i]) return false;
		}
		return true;
	}
	
	public static void write(int[] hindo,int counter){
		System.out.println(counter);
		for(int i = 0; i < hindo.length; i++){
			System.out.print(hindo[i]);
			if(i != hindo.length){
				System.out.print(" ");
			}
		}
	}
}