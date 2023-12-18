import java.util.*;

class Main {
	public static void main(String[] args){
		int[] array = new int[1 << 15];
		int[] prime = new int[1 << 15];
		
		int cnt = 0;
		
		for(int i = 2; i < array.length; i++){
			if(array[i] == 0){
				array[i] = 1;
				prime[cnt++] = i;
				for(int j = i * 2; j < array.length; j += i){
					array[j] = 1;
				}
			}
		}

		int n, ans;
		Scanner sc = new Scanner(System.in);
		while((n = sc.nextInt()) != 0){
			ans = 0;
			for(int i = 0; i < cnt; i++){
				for(int j = i; j < cnt; j++){
					if(prime[i] + prime[j] == n){
						ans++;
					}
				}
			}
			
			System.out.println(ans);
		
		}
	}
}