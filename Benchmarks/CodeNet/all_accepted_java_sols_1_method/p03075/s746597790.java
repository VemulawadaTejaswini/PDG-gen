import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int antena[] = new int[5];
		for(int i = 0; i < 5; i++){
			antena[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		boolean a = false;
		out : for(int i = 0; i < 4; i++){
			for(int j = i+1; j < 5; j++){
				if((antena[i] - antena[j] > k) || (antena[i] - antena[j] < -k)){
					a = true;
					break out;
				}
			}
		}
		if(!a){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}
}