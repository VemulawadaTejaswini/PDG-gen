public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int result = 0;
		int num = 0;
		while(true){
			result = 0;
			int n = scan.nextInt();
			int x = scan.nextInt();
			if (n == 0 && x == 0){
				break;
			}
			for(int i = 1 ; i <= n - 2 ; i++){
				for(int j = i + 1 ; j <= n - 1 ; j++){
					for(int k = j + 1 ; k <= n ; k++){
						if(i + j + k == x){
							result++;
						}
					}
				}
			}
			System.out.println(result);
		}
	}
}