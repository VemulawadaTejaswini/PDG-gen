import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] array = a.split("");
		int l = array.length;
		int count = 0;

		for(int i = 0; i < l/2;i++){
			if(!array[i].equals(array[l-i-1])){
				count++;
			}
		}
		System.out.println(count);
	}
}