import java.util.Scanner;

class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int length =scan.nextInt();
		
		while(scan.hasNext()){
			for(int i=0; i<length; i++){
				int stones = scan.nextInt();
				int people = scan.nextInt();
			
				if(stones % people != 0){
					System.out.println(stones % people);
				}else{
					System.out.println(stones/people);
				}
			}
		}
	}
}