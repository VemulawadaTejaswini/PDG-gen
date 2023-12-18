import java.util.Scanner;

class main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int sum=0;
		int i;
		int data;
		for(i = 0 ;i < 4; i++){
			data = stdIn.nextInt();
			sum += data;
		}
		System.out.println(sum/60);
		System.out.println(sum%60);
	}

}