import java.util.Scanner;

public class Main{
	public Main(){
		String[] str = new String[6];
		for(int i = 0; i < 6; i++){
			str[i] = (i+1) + ":";
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double tmp;
		
		for(int i = 0; i < n; i++){
			tmp = sc.nextDouble();
			
			if(tmp < 165.0){
				str[0] += "*";
			} else if(tmp < 170.0){
				str[1] += "*";
			} else if(tmp < 175.0){
				str[2] += "*";
			} else if(tmp < 180.0){
				str[3] += "*";
			} else if(tmp < 185.0){
				str[4] += "*";
			} else {
				str[5] += "*";
			}
		}
		
		for(String s: str){
			System.out.println(s);
		}
	}

	public static void main(String[] args){
		Main ma = new Main();
	}
}