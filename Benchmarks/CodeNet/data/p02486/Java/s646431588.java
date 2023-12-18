import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int m, f, count = 0, sum;
		m = scanner.nextInt();
		f = scanner.nextInt();
		while(!(m == 0 && f == 0)) {
			for(int i = 1;i < m+1;i++) {
				for(int j = 1;j < m+1;j++) {
					for(int k = 1;k < m+1;k++) {
							sum =  i+j+k;
							if(sum == f && (i!=j)&&(j!=k)&&(k!=i)) 
								count++;
							sum = 0;
					}
				}
			}
			System.out.println(count/(1*2*3));
			m = scanner.nextInt();
			f = scanner.nextInt();
		}
		scanner.close();
	}
}