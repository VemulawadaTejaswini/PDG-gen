import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			ArrayList<String> list = new ArrayList<String>();
			int[] p = new int[n];
			
			for(int i=0;i<n;i++){
				list.add(sc.next());
				p[i] = sc.nextInt();
			}
			
			int m = sc.nextInt();
			String[] s = new String[m];
			String[][] map = new String[m][];
			int q;
			for(int i=0;i<m;i++){
				s[i] = sc.next();
				q = sc.nextInt();
				map[i] = new String[q];
				for(int j=0;j<q;j++){
					map[i][j] = sc.next();
				}
			}
			
			boolean flag, check;
			while(true){
				flag = false;
				for(int i=0;i<m;i++){
					if(list.contains(s[i])==true){
						check = false;
						for(int j=0;j<map[i].length;j++){
							if(list.contains(map[i][j])==false){
								check = true;
								break;
							}
						}
						if(check==false){
							q = 0;
							for(int j=0;j<map[i].length;j++){
								q += p[list.indexOf(map[i][j])];
							}
							if(q<p[list.indexOf(s[i])]){
								p[list.indexOf(s[i])] = q;
								flag = true;
							}
						}
					}
				}
				if(flag==false) break;
			}
			System.out.println(p[list.indexOf(sc.next())]);
		}
	}	
}