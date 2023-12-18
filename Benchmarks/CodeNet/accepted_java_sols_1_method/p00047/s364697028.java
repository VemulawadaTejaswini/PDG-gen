import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int iti [] = new int [128];
		iti ['A'] = 1;
		iti ['B'] = 0;
		iti ['C'] = 0;
		int change = 0;
		while(true){
			try{
				String a = in.next();
				char[] num = a.toCharArray();
				change = iti[num[0]];
				iti[num[0]] = iti[num[2]];
				iti[num[2]] = change;
			}catch(Exception e){
				for(char i = 'A';i <= 'C';i++){
					if(iti[i] == 1){
						System.out.println(i);
					}
				}
				System.exit(0);
			}
		}
	}
}