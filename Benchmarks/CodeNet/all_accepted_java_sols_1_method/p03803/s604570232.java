import java.io.* ;

class Main {
	public static void main(String args[]) throws IOException {
		int number[];
		number = new int[2];

		BufferedReader input = 
			new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine();
		String strNum[]= str.split(" ");
 		
		for(int i = 0; i < 2; i++){
			number[i] = Integer.parseInt(strNum[i]);
			if(number[i] == 1) number[i] += 13; 
		}


	if(number[0] > number[1]){
		System.out.println("Alice");
	} else if (number[0] < number[1]) {
		System.out.println("Bob");
	}else if (number[0] == number[1]){
		System.out.println("Draw");
	}

	return ;
	}
}
