import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int max,min;
		int a,b;
		
	int counter = 0;
		while(s.hasNext()){
			
			a = s.nextInt();
			b = s.nextInt();
			int x = a;
			int y = b;
			while(x!=y){
				if(x>y){
					y += b;
				}else{
					x += a;
				}
			}
			min = x;
			max = (int)((long)a * b / min);
			System.out.println(max+" "+min);

		}
	}
}