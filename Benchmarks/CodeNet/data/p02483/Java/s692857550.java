import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] str = {0,0,0};
		int sub;
		for(int i = 0; i < 3; i++){
			str[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 2; i++){
			if(str[0] > str[1]){
				sub = str[0];
				str[0] = str[1];
				str[1] = sub;
			}
			if(str[1] > str[2]){
				sub = str[1];
				str[1] = str[2];
				str[2] = sub;
			}
			if(str[0] > str[1]){
				sub = str[0];
				str[0] = str[1];
				str[1] = sub;
			}
		}
		System.out.println(str[0]+" "+str[1]+" "+str[2]);
			
	}
}