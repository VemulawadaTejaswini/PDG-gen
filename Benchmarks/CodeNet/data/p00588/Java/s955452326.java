import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int shelves = sc.nextInt();
			String ID = sc.next();
			int ans = 0;
			boolean pass = false;
			
			for(int j = 0; j < shelves; j++){
				if(ID.charAt(2 * shelves + 2 * j) == 'Y' || ID.charAt(2 * shelves + 2 * j + 1) == 'Y'){
					pass = true;
				}
			}
			if(pass){
				ans++;
				ID = "N" + ID.substring(1, ID.length());
				if(ID.charAt(shelves * 2) == 'Y')
					ans++;
				for(int j = 1; j <= shelves; j++){
					ans++;
					boolean last = false;
					if(j == shelves){
						if(ID.charAt(2 * j - 1) == 'Y'){
							ans++;
							last = false;
						}
						if(ID.charAt(2 * shelves + 2 * j - 1) == 'Y'){
							ans++;
							last = true;
						}
						if(last)
							ans++;
					}else{
						if(ID.charAt(2 * j - 1) == 'Y' || ID.charAt(2 * j) == 'Y'){
							ans++;
							last = false;
						}
						if(ID.charAt(2 * shelves + 2 * j - 1) == 'Y' || ID.charAt(2 * shelves + 2 * j) == 'Y'){
							ans++;
							last = true;
						}
						if(j == shelves && last)
							ans++;
					}
				}
			}else{
				if(ID.charAt(0) == 'Y')
					ans++;
				for(int j = 1; j <= shelves; j++){
					ans++;
					if(j == shelves){
						if(ID.charAt(2 * j - 1) == 'Y')
							ans++;
					}else{
						if(ID.charAt(2 * j - 1) == 'Y' || ID.charAt(2 * j) == 'Y')
							ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}