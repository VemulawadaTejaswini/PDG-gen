import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		new Main().run();
		
	}

	Scanner scanner = new Scanner(System.in);
	int n;
	int q;
	
	private class Data implements Comparable<Data> {
		
		String en;
		int eby;
		int wy;
		
		private Data(String en, int eby, int wy) {
			
			this.en = en;
			this.eby = eby;
			this.wy = wy;
			
		}

		@Override
		public int compareTo(Data o) {
			
			return wy - o.wy;
			
		}
		
	}
	
	Data[] db;
	
	private void run() {
		
		for(;nq();) {
			
			db = new Data[n];
			
			for (int i = 0; i < db.length; i++) {
				
				db[i] = new Data(scanner.next(), scanner.nextInt(), scanner.nextInt());
				
			}
			
			Arrays.sort(db);
			
			for (int i = 0; i < q; i++) {
				
				Data qry = new Data("", 0, scanner.nextInt());
				int ip = Arrays.binarySearch(db, qry);
				
				if (ip < 0) {
					
					ip = - ip - 1;
					
				}
				
				if (ip < db.length) {
					
					qry.wy = qry.wy - db[ip].wy + db[ip].eby;
					
					if (qry.wy > 0) {
						
						System.out.println(db[ip].en + " " + qry.wy);
						continue;
					}
					
				}
				
				System.out.println("Unknown");
				
			}
			
		}
		
	}

	private boolean nq() {
		
		n = scanner.nextInt();
		q = scanner.nextInt();
		
		return (n | q) != 0;
		
	}

}