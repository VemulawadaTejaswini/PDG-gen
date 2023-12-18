import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int vertical;
		int cross;
		int[] num = new int[30];
		int[] change = new int[2];
		int i,tmp;
		
		vertical = scan.nextInt();
		cross = scan.nextInt();
		
		for(i=1;i<=vertical;i++){
			num[i] = i;
		}
		
		for(i=0;i<cross;i++){
			scan = new Scanner(System.in);
			scan.useDelimiter(",||\n");
			
			change[0] = scan.nextInt();
			change[1] = scan.nextInt();
			
			tmp = num[change[0]];
			num[change[0]] = num[change[1]];
			num[change[1]] = tmp;
		}
		
		for(i=0;i<vertical;i++){
			System.out.println(num[i+1]);
		}
		
		scan.close();
	}
}