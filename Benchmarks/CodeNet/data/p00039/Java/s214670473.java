import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> array = new ArrayList<Integer>();
		try{
			while(true){
				char[]a= br.readLine().toCharArray();
				array.add(parseInt(a));
			}
		}catch(Exception e){
		}

		for(int v : array){
			System.out.println(v);
		}
	}

	public static int parseInt(char a){
		int temp = 0;
		switch(a){
		case 'I':
			temp = 1;break;
		case 'V':
			temp = 5;break;
		case 'X':
			temp = 10;break;
		case 'L':
			temp = 50;break;
		case 'C':
			temp = 100;break;
		case 'D':
			temp = 500;break;
		case 'M':
			temp = 1000;break;
		}
		return temp;
	}

	static int[] getNumbers(char[] a){
		int[] numbers = new int[a.length];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = parseInt(a[i]);
		}
		if(numbers.length > 1){
			for(int i = 1; i < numbers.length; i++){
				if(numbers[i] > numbers[i - 1]){
					numbers[i -1] *= -1;
				}
			}
		}

		return numbers;
	}

	public static int parseInt(char[] romanValue){
		int temp = 0;
		int[] numbers = getNumbers(romanValue); 
		for(int i = 0; i < numbers.length; i++){
			temp += numbers[i];
		}
		return temp;
	}

}