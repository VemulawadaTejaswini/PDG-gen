import java.util.Scanner;

class Main{
	static Scanner scan = new Scanner(System.in);
	static int[] num = new int[100];
	static int length = 0;
	public static void main(String args[]){
		length = scan.nextInt();
		for(int i=0;i<length;i++){
    		num[i] = scan.nextInt();
    	}
		for(int i=length; i>1;i--){
			System.out.print(num[i-1] + " ");
		}
		System.out.print(num[0]);
	    }
}