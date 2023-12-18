import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[3]; 
		int change;
		
		number[0]=sc.nextInt();
		number[1]=sc.nextInt();
		number[2]=sc.nextInt();
		
		for(int n=2; n>0; n--){
			for(int i=0; i<n; i++){
				if(number[i]>number[i+1]){
					change=number[i];
					number[i]=number[i+1];
					number[i+1]=change;
				}
			}
		}
		
		System.out.println(number[0] + " " + number[1] + " " + number[2]);
		

	}

}