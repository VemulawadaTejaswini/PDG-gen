import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(cin.hasNext()){
			String str = cin.next();
			str = str.replace('o', '1');
			str = str.replace('x', '9');
			str = str.replace('s', '0');
			
			int[][] a = new int[3][3];
			String[] s = new String[3];
			s[0]=str.substring(0, 3);
			s[1]=str.substring(3, 6);
			s[2]=str.substring(6, 9);
			for(int i = 0; i < 3;i++){
				for(int j = 0; j < 3;j++){
					a[i][j] = Integer.parseInt(s[i].substring(j, j+1));
				}
			}
			for(int i = 0; i < 3;i++){
				if(a[i][0]+a[i][1]+a[i][2] == 3){
					System.out.println("o");
					continue label;
				}
				else if(a[i][0]+a[i][1]+a[i][2] == 27){
					System.out.println("x");
					continue label;
				}
			}
			for(int i = 0; i < 3;i++){
				if(a[0][i]+a[1][i]+a[2][i] == 3){
					System.out.println("o");
					continue label;
				}
				else if(a[0][i]+a[1][i]+a[2][i] == 27){
					System.out.println("x");
					continue label;
				}
			}
			if(a[0][0]+a[1][1]+a[2][2]==3){
				System.out.println("o");
				continue;
			}
			else if(a[0][0]+a[1][1]+a[2][2]==27){
				System.out.println("x");
				continue;
			}
			if(a[2][0]+a[1][1]+a[0][2]==3){
				System.out.println("o");
				continue;
			}
			else if(a[2][0]+a[1][1]+a[0][2]==27){
				System.out.println("x");
				continue;
			}
			System.out.println("d");
		}
	}

}