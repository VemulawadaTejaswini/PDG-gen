import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 9999;
		int N = sc.nextInt();
		int i = 0;
		int tmp = 0;
		while(i<N){
			tmp = sc.nextInt();
			if(max<tmp){
				max = tmp;
			}
			if(tmp<min){
				min = tmp;
			}
			i++;
		}
		
		System.out.println(Math.abs(max-min));
	}

}
