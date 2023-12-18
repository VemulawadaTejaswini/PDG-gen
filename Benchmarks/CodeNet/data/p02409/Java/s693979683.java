import java.util.Scanner;
class Main {
	private static int[] n1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static int[] n2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static int[] n3 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static int[] n4 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();

			if(b == 1){
				if(f == 1){
					for(int j = 1; j <= 10; j++){
						if(j == r){
							if(v >= 0){
								n1[j] = v;
							}else {
								n1[j] = n1[j] + v;
							}
						}
					}
				}else if(f == 2){
					for(int j = 11; j <= 20; j++){
						if(j == r + 10){
							if(v >= 0){
								n1[j] = v;
							}else {
								n1[j] = n1[j] + v;
							}
						}
					}
				}else if(f == 3){
					for(int j = 21; j <= 30; j++){
						if(j == r + 20){
							if(v >= 0){
								n1[j] = v;
							}else {
								n1[j] = n1[j] + v;
							}
						}
					}
				}
			}else if(b == 2){
				if(f == 1){
					for(int j = 1; j <= 10; j++){
						if(j == r){
							if(v >= 0){
								n2[j] = v;
							}else {
								n2[j] = n2[j] + v;
							}
						}
					}
				}else if(f == 2){
					for(int j = 11; j <= 20; j++){
						if(j == r + 10){
							if(v >= 0){
								n2[j] = v;
							}else {
								n2[j] = n2[j] + v;
							}
						}
					}
				}else if(f == 3){
					for(int j = 21; j <= 30; j++){
						if(j == r + 20){
							if(v >= 0){
								n2[j] = v;
							}else {
								n2[j] = n2[j] + v;
							}
						}
					}
				}
			}else if(b == 3){
				if(f == 1){
					for(int j = 1; j <= 10; j++){
						if(j == r){
							if(v >= 0){
								n3[j] = v;
							}else {
								n3[j] = n3[j] + v;
							}
						}
					}
				}else if(f == 2){
					for(int j = 11; j <= 20; j++){
						if(j == r + 10){
							if(v >= 0){
								n3[j] = v;
							}else {
								n3[j] = n3[j] + v;
							}
						}
					}
				}else if(f == 3){
					for(int j = 21; j <= 30; j++){
						if(j == r + 20){
							if(v >= 0){
								n3[j] = v;
							}else {
								n3[j] = n3[j] + v;
							}
						}
					}
				}
			}else if(b == 4){
				if(f == 1){
					for(int j = 1; j <= 10; j++){
						if(j == r){
							if(v >= 0){
								n4[j] = v;
							}else {
								n4[j] = n4[j] + v;
							}
						}
					}
				}else if(f == 2){
					for(int j = 11; j <= 20; j++){
						if(j == r + 10){
							if(v >= 0){
								n4[j] = v;
							}else {
								n4[j] = n4[j] + v;
							}
						}
					}
				}else if(f == 3){
					for(int j = 21; j <= 30; j++){
						if(j == r + 20){
							if(v >= 0){
								n4[j] = v;
							}else {
								n4[j] = n4[j] + v;
							}
						}
					}
				}
			}
					}
		for(int i = 1; i <= 10; i++){
			System.out.print(" " + n1[i]);
		}
		System.out.println();
		for(int i = 11; i <= 20; i++){
			System.out.print(" " + n1[i]);
		}
		System.out.println();
		for(int i = 21; i <= 30; i++){
			System.out.print(" " + n1[i]);
		}
		System.out.println();
		System.out.println("####################");
		
		for(int i = 1; i <= 10; i++){
			System.out.print(" " + n2[i]);
		}
		System.out.println();
		for(int i = 11; i <= 20; i++){
			System.out.print(" " + n2[i]);
		}
		System.out.println();
		for(int i = 21; i <= 30; i++){
			System.out.print(" " + n2[i]);
		}
		System.out.println();
		System.out.println("####################");
		
		for(int i = 1; i <= 10; i++){
			System.out.print(" " + n3[i]);
		}
		System.out.println();
		for(int i = 11; i <= 20; i++){
			System.out.print(" " + n3[i]);
		}
		System.out.println();
		for(int i = 21; i <= 30; i++){
			System.out.print(" " + n3[i]);
		}
		System.out.println();
		System.out.println("####################");
		
		for(int i = 1; i <= 10; i++){
			System.out.print(" " + n4[i]);
		}
		System.out.println();
		for(int i = 11; i <= 20; i++){
			System.out.print(" " + n4[i]);
		}
		System.out.println();
		for(int i = 21; i <= 30; i++){
			System.out.print(" " + n4[i]);
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().kami();
	}

}