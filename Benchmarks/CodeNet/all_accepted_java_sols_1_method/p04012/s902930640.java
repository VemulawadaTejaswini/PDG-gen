import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();


		int[] arr = new int[300];
		
		for(int i = 0; i < 300; i++){
			arr[i] = 0;
		}
		
		for(char a : str.toCharArray()){
			arr[a] += 1;
		}

		boolean r = true;
		
		for(int i = 0; i < 300; i++){
			if(arr[i] % 2 == 1){
				r = false;
			}
		}
		if(r){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}

}
