import java.util.Scanner;

class Main {
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
	
		int m;
		int[] tall;
		tall = new int[3];
		
		for(int i = 0; i < 10; i++){
			m = scan.nextInt();
			if(tall[0] < m){
				tall[2] = tall[1];
				tall[1] = tall[0];
				tall[0] = m;
			}else if(tall[1] < m){
				tall[2] = tall[1];
				tall[1] = m;
			}else if(tall[2] < m){
				tall[2] = m;
			}
		}
		for(int i = 0; i < 3; i++){
			System.out.println(tall[i]);
		}
	}
}