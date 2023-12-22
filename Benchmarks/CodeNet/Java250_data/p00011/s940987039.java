import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int vertical;
		int cross;
		int[] num = new int[30];
		int[] change = new int[2];
		int i,tmp;
		String Line;
		String splitLine[] = new String[2];
		
		vertical = scan.nextInt();
		cross = scan.nextInt();
		
		for(i=0;i<vertical;i++){
			num[i] = i+1;
		}
		
		for(i=0;i<cross;i++){
			Line = scan.next();
			splitLine = Line.split(",");
			
			change[0] = Integer.parseInt(splitLine[0]);
			change[1] = Integer.parseInt(splitLine[1]);
			
			tmp = num[change[0]-1];
			num[change[0]-1] = num[change[1]-1];
			num[change[1]-1] = tmp;
		}
		
		for(i=0;i<vertical;i++){
			System.out.println(num[i]);
		}
		
		scan.close();
	}
}