import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int valLen = 0;
		int count = 0;
		
		for(int i=1;i<=val;i++){
			valLen = String.valueOf(i).length();
			if(valLen%2 == 1){
				count++;
			}
		}
		
		System.out.println(count);
	}
}