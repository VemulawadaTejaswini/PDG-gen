import java.util.*;

public class Main{
	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		String[] num = input.split("\\s");

		int[] numb = new int[num.length];

		for(int i = 0; i < numb.length; i++){
			numb[i] = Integer.parseInt(num[i]);
		}

		for(int i = 0; i <numb.length; i++){
			for(int j = numb.length - 1; j > i; j--){
				if(numb[j] < numb[j-1]){
					int s = numb[j];
					numb[j] = numb[j-1];
					numb[j-1] = s;
				}
			}
		}
		System.out.println(numb[0] + " " + numb[1] + " " + numb[2]);
	}
}