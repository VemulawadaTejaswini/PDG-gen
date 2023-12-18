import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] a = scan.nextLine().split(" ");
			String[] b = scan.nextLine().split(" ");
			int sumA = 0;
			int sumB = 0;
			for(int i=0;i<4;i++){
				sumA += Integer.parseInt(a[i]);
				sumB += Integer.parseInt(b[i]);
			}
			System.out.println(Math.max(sumA,sumB));
		}
	}
}