import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			double x,y;
			String[] s = sc.nextLine().split("[\\s]+");
			int[] data = new int[s.length];
			for(int i=0;i<s.length;i++){
				data[i] = Integer.parseInt(s[i]);
			}
			
			x = (((data[2]*data[4])-(data[1]*data[5])) / ((data[0]*data[4])-(data[1]*data[3])));
			y = (((data[0]*data[5])-(data[2]*data[3])) / ((data[0]*data[4])-(data[1]*data[3])));
			
			System.out.println(x+" "+y);
		}
		
	}
}