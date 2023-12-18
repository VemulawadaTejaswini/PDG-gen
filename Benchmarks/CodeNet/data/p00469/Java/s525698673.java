import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			
			if(n == 0 && k == 0){
				break;
			}
			
			String[] str = new String[n];
			for(int i = 0; i < n; i++){
				str[i] = sc.next();
			}
			
			HashSet<String> hash = new HashSet<String>();
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					
					if(k == 2){
						if(i == j){
							continue;
						}else{
							hash.add(str[i] + str[j]);
						}
					}else{
						
						for(int l = 0; l < n; l++){
						
							if(k == 3){
								if(i == j || j == l || i == l){
									continue;
								}else{
									hash.add(str[i] + str[j] + str[l]);
								}
							}else{
							
								for(int m = 0; m < n; m++){
									if(i == j || j == l || l == m || m == i || i == l || j == m){
										continue;
									}else{
										hash.add(str[i] + str[j] + str[l] + str[m]);
									}
								}
							}
						}
					}
					
				}
			}
			
			System.out.println(hash.size());
			
		}
		
	}

}