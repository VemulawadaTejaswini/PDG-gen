import java.util.*;

public class Main{
	//0110 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			String [] name = new String[n];
			int [] start = new int[n];
			int [] end = new int[n];
			for(int i = 0; i < n; i++){
				name[i] = sc.next();
				int a = sc.nextInt();
				end[i] = sc.nextInt();
				start[i] = end[i] - a + 1;
			}
			
			for(int i = 0; i < m; i++){
				int yy = sc.nextInt();
				boolean flg = true;
				for(int j = 0; j < n; j++){
					if(start[j] <= yy && yy <= end[j]){
						flg = false;
						int res = yy - start[j] + 1;
						System.out.println(name[j] + " " + res);
						break;
					}
				}
				if(flg){
					System.out.println("Unknown");
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}