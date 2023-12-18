	import java.util.*;
	class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int[][] a = new int[3][3];
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++)
					a[i][j] = sc.nextInt();
			int n = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < n; i++)
				set.add(sc.nextInt());
			int count = 0, countr = 0, countd = 0;
			for (int i = 0; i < 3; i++){
				count = 0;
				for (int j = 0; j < 3; j++){
					//~ System.out.println(a[i] + " 2 " );
					if(set.contains(a[i][j])){
						count++;
						//~ System.out.println(a[i][j] + " 1 ");
					} 
					if(i == j){
							if (set.contains(a[i][j])){
									countd++;
									//~ System.out.println(a[i][j] + " 2 " );
						}
					}
				}
				countr = Math.max(count, countr);
			}
			int countc = 0;
				for (int i = 0; i < 3; i++){
				count = 0;
				for (int j = 0; j < 3; j++){
					if(set.contains(a[j][i]) ){
						count++;
					}
				}
				countc = Math.max(countc, count);
				} 
				
				int countdd = 0;
			if(set.contains(a[0][2]))
				countdd++;
			if(set.contains(a[1][1]))
				countdd++;
			if(set.contains(a[2][0]))
				countdd++;
				
			if(countc == 3 || countr == 3 | countd == 3 || countdd == 3)
				System.out.println("Yes");
			else 
				System.out.println("No");
		}
	}
