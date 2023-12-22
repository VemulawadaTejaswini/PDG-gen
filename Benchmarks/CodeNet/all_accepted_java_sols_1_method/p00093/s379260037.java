import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		while(scan.hasNext()){
			boolean sw = true;
			for(int i = a;i <= b;i++){
				if(i % 4 == 0){
					if(i % 400 == 0){
						System.out.println(i);
						sw = false;
					}else if(i % 100 != 0){
						System.out.println(i);
						sw = false;
					}
				}
			}
			if(sw){
				System.out.println("NA");
			}
			a = scan.nextInt();
			b = scan.nextInt();
			if(a == 0 && b == 0){
				break;
			}else{
				System.out.println();
			}
		}
	}
}