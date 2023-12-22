import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");

		int count = 0;
		int max = 0;
		for(String str : arr){

			if(str.equals("R")){
				count++;
			}else{
				if(count > max){
					max = count;
				}
				count=0;
			}
		}


		if(count > max){
			max = count;
		}

		System.out.println(max);


	}
}