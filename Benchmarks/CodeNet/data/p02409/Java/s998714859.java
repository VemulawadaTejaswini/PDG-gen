import java.util.Scanner;

public class Main_2 {
	
	public static void main(String[] args) {
		int a = 0;
		int to,kai,ban;
		int [][][] nin = new int [5][4][11];
		
		for(to = 1; to < 5; to++){
			for(kai = 1; kai < 4; kai++){
				for(ban = 1; ban < 11; ban++){
					nin[to][kai][ban] = 0;
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(a != n){
			String i = sc.next();        // b=棟  f=階  r=号  v=人数
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			int b = Integer.parseInt(i);
			nin [b][f][r] = nin [b][f][r] + (v);
			a++;
		}
		
		for(to = 1; to < 5; to++){
			for(kai = 1; kai < 4; kai++){
				for(ban = 1; ban < 11; ban++){
					if(ban == 1){
						System.out.print(" " + nin[to][kai][ban] + " ");
					}else if(ban != 10){
						System.out.print(nin[to][kai][ban] + " ");
					}else{
						System.out.print(nin[to][kai][ban]);
					}
				}
				System.out.println();
			}
			if(kai == 4 && to != 4){
				System.out.println("####################");
			}
		}
		sc.close();
	}
}
