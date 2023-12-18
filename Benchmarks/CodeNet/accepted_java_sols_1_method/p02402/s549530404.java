import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1000000; 
		int min = 1000000;
		long sum = 0;
		for(int i = 0;i < n;i++){
			int newValue = sc.nextInt();
			if(newValue < min){
				min = newValue;
			}
			if(newValue > max){
				max = newValue;
			}
			sum += newValue;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
