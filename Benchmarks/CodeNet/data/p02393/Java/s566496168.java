import java.util.Scanner;

class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] hako = new int[] {a, b, c};
		
		for(int i=0;i<hako.length-1;i++){
			for(int j=hako.length-1;j>i;j--){
				if(hako[j]<hako[j-1]){
					  int t=hako[j];
					  hako[j]=hako[j-1];
					  hako[j-1]=t;
				}
			}
		}
		System.out.println(hako[0] + " " + hako[1] + " " + hako[2]);
	}
}