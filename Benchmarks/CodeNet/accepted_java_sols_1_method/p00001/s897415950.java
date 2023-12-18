import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int first=0,second=0,third=0;
		
		for(int i = 0;i < 10;i++){
			int temp = scan.nextInt();
			if(first < temp){
				third = second;
				second = first;
				first = temp;
			}else if(second < temp){
				third = second;
				second = temp;
			}else if(third < temp){
				third = temp;
			}
		}
		System.out.println(first + "\n" + second + "\n" + third);
	}
}