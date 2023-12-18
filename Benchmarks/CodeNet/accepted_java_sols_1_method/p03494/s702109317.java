import java.util.*;

public class Main{
	public static void main(String[] args){
		Integer count = 0;
		int flag = 0;
		Scanner sc = new Scanner(System.in);

		//入力する数
		int number = sc.nextInt();
		int blackbord[] = new int[number];

		for (int i = 0; i < number; i++){
			blackbord[i] = sc.nextInt();
			//System.out.println(blackbord[i]);
		}
		
		while(flag == 0){
			for(int i = 0; i < number; i++){
				if (blackbord[i] % 2 != 0){
					flag = 1;
					break;
				}
			blackbord[i] = blackbord[i]/2;
			
			count += 1;
			
		}
	}

	count = count / number;
	System.out.println(count);


	}
}