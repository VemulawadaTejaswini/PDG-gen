import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean check = false;
		
		for(int i = 1; i<10; i++){

			if(check == false){

				for(int j =1; j <10; j++){

					if(i*j == n){
						check = true;
						break;
					}

				}

			}else{
				break;
			}
		}

		if(check){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}
		
	}
}

