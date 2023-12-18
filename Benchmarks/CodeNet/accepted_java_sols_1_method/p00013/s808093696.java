import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int[] train = new int[10];
		int point = 0;
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n > 0){
				train[point] = n;
				point++;
			}
			else{
				System.out.println(train[point - 1]);
				point--;
			}
		}
	}
}