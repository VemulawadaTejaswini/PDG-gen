import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String model;
		String[] words = null;
		int i = 0, j = 0,count = 0;
		model = sc.next();
		words[0] = sc.next();
		while (j == 0) {
			if (words[i] != "END_OF_TEXT") {
				words[i + 1] = sc.next();
				i++;
			}else{
				j = 1;
			}
		}
		for(i = 0; i <words.length ; i++){
			if(words[i] == model){
				count++;
			}
		}
		System.out.println(count);
	}
}