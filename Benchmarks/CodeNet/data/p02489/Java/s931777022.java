import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true){
			count ++;
			int num = scan.nextInt();
			if(num == 0){
				break;
			}else{
				System.out.println("Case "+count+": "+num+"");
			}
		}
		scan.close();
	}
}