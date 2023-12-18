import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0; i<3; i++){
			num[i] = scan.nextInt();
		}
		scan.close();

		for(int s=0; s<num.length; s++){
			for(int t=s+1; t<num.length; t++){
				if(num[t]<num[s]){
					int tmp = num[s];
					num[s] = num[t];
					num[t] = tmp;
				}
			}
		}


		System.out.println(num[0] + " " + num[1] + " " + num[2]);
	}
}