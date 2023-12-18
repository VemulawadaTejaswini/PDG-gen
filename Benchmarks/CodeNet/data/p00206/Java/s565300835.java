import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int l = scan.nextInt();
			if(l == 0){
				break;
			}
			int sum = 0;
			boolean f = true;
			for(int i = 0;i < 12;i++){
				sum += (scan.nextInt() - scan.nextInt());
				if(sum > l && f){
					System.out.println(i+1);
					f = false;
				}
			}
			if(f){
				System.out.println("NA");
			}
		}
	}
}