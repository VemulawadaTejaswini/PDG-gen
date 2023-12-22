import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int jewnum, comnum, rx, ry;
		boolean hoge;
		
		int[][] route = new int[21][21];
		
		for(;;){
			jewnum = scanner.nextInt();
			if(jewnum == 0) break;
			int[] jewxpos = new int[jewnum];
			int[] jewypos = new int[jewnum];
			for(int i = 0; i < jewnum; i++){
				jewxpos[i] = scanner.nextInt();
				jewypos[i] = scanner.nextInt();
			}
			
			comnum = scanner.nextInt();
			String[] comdir = new String[comnum];
			int[] comdis = new int[comnum];
			for(int i = 0; i < comnum; i++){
				comdir[i] = scanner.next();
				comdis[i] = scanner.nextInt();
			}
			
			rx = ry = 10;
			for(int i = 0; i < 21; i++){
				for(int j = 0; j < 21; j++){
					route[i][j] = 0;
				}
			}
			for(int i = 0; i < comnum; i++){
				if(comdir[i].equals("N")){
					for(int j = 1; j <= comdis[i]; j++){
						++ry;
						route[rx][ry] = 1;
					}
				}else if(comdir[i].equals("E")){
					for(int j = 1; j <= comdis[i]; j++){
						++rx;
						route[rx][ry] = 1;
					}
				}if(comdir[i].equals("S")){
					for(int j = 1; j <= comdis[i]; j++){
						--ry;
						route[rx][ry] = 1;
					}
				}if(comdir[i].equals("W")){
					for(int j = 1; j <= comdis[i]; j++){
						--rx;
						route[rx][ry] = 1;
					}
				}
			}
			
			hoge = true;
			for(int i = 0; i < jewnum; i++){
				if(route[jewxpos[i]][jewypos[i]] == 0){
					hoge = false;
				}
			}
			
			if(hoge == true)	System.out.println("Yes");
			else System.out.println("No");
		}
	}
}