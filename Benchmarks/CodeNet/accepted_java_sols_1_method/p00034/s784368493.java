import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String[] st = input.nextLine().split(",");
			int sum = 0;
			int as = Integer.parseInt(st[10]);
			int bs = Integer.parseInt(st[11]);
			for(int i = 0 ; i < 10 ; i++){
				sum += Integer.parseInt(st[i]);
			}
			double t = (double)sum / (as+bs);
			int sc = (int)Math.round(t*as);
			int nsum = 0;
			for(int i = 0 ; i < 10 ; i++){
				nsum += Integer.parseInt(st[i]);
				if(sc <= nsum){
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}