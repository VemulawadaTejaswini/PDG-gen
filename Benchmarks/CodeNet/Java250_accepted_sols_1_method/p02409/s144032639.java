import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{

		int su1[][] = new int [3][10];
		int su2[][] = new int [3][10];
		int su3[][] = new int [3][10];
		int su4[][] = new int [3][10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		int bill = 0;
		int floor = 0;
		int room = 0;
		int person = 0;

		for(int i = 0; i < count; i++){
			String str = br.readLine();
			String[] s = str.split(" ");

			bill = Integer.parseInt(s[0]);
			floor = Integer.parseInt(s[1]);
			room = Integer.parseInt(s[2]);
			person = Integer.parseInt(s[3]);


			if(bill == 1){
				su1[floor - 1][room - 1] += (person);
			}else if(bill == 2){
				su2[floor - 1][room - 1] += (person);
			}else if(bill == 3){
				su3[floor - 1][room - 1] += (person);
			}else if(bill == 4){
				su4[floor - 1][room - 1] += (person);
			}
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" "+su1[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" "+su2[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" "+su3[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" "+su4[i][j]);
			}
			System.out.println();
		}
	}
}