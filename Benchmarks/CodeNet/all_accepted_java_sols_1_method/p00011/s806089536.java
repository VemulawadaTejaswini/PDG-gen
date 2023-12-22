import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		//.useDelimiter
		
		int w = sc.nextInt();		
		int n = sc.nextInt();
		
		ArrayList<Integer> line_number = new ArrayList<Integer>();
		
		for(int i=1; i<=w; i++){
			line_number.add(i);
		}
		
		for(int i=1; i<=n; i++){
			String[] str = sc.next().split(",");
	    	int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			int temp_1 = line_number.get(a-1);
			int temp_2 = line_number.get(b-1);
			
			line_number.set(a-1,temp_2);
			line_number.set(b-1,temp_1);
		}
		for(int j=0; j<w; j++){
			System.out.println(line_number.get(j));
		}
	}
}