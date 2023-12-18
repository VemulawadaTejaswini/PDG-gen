import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] mar;
		int[] num;
		num = new int[52];
		int n = scan.nextInt();
		int i;
		for(i = 1; i <= n; ++i){
			String m = scan.next();
			int x = scan.nextInt();
			if(m == "S"){
				num[x] = x;				
			}
			else if(m == "H"){
				x = x + 12;
				num[x] = x;
			}
			else if(m == "C"){
				x = x + 24;
				num[x] = x;
			}
			else if(m == "D"){
				x = x + 36;
				num[x] = x;
			}	
		}
		int s;
		s = 0;
		for(i = 1; i <= 52; ++i){
			if(num[i] == 0){
				if(i - 12 > 0){
					if(i - 24 > 0){
						if(i - 36 > 0){
							s = s - 36;
							System.out.println("D "+s);
						}
						else{
							s = s - 24;
							System.out.println("C "+s);
						}
					}
					else{
						s = s - 12;
						System.out.println("H "+s);
					}
				}
				else{
					System.out.println("S "+i);
				}
			}
		}
	}
}
		
				