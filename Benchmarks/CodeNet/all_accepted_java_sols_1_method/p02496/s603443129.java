import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [][] data = new int [4][14];
		int m=0;
		
		for(int z=0;z<n;z++){
			String a = sc.next();
			int x = sc.nextInt();
			if(a.equals("S")){
				m=0;
			}else if(a.equals("H")){
				m=1;
			}else if(a.equals("C")){
				m=2;
			}else if(a.equals("D")){
				m=3;
			}
			data[m][x]=1;
		}
		
		for(int i = 0; i < 4; i++){
			for(int j = 1; j < 14; j++){
				if(data[i][j] != 1){
					if(i == 0){
						System.out.println("S "+j);
					}else if(i==1){
						System.out.println("H "+j);
					}else if(i==2){
						System.out.println("C "+j);
					}else if(i==3){
						System.out.println("D "+j);
					}
				}
			}
		}
	}
}