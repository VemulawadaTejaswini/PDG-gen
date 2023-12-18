import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int i;
		
		for(i=0;i<5;i++){
			num[i] = scan.nextInt();
		}
		
		for(i=0;i<4;i++){
			for(int j=4;j>i;j--){
				if(num[j]>num[j-1]){
					int t = num[j];
					num[j] = num[j-1];
					num[j-1] = t;
				}
			}
		}
		System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4]);
	}
}