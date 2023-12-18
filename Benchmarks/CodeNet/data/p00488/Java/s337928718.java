import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int men[] = new int[3];
		int nomi[] = new int[2];
		for(int i = 0; i < 3; i++){
			men[i] = sc.nextInt();
		}
		for(int j = 0; j < 2; j++){
			nomi[j] = sc.nextInt();
		}
		int taihi, taihi2;
		for(int i = 0; i < 3; i++){
			for(int k = i + 1; k < 3; k++){
				if(men[i] > men[k]){
					taihi = men[i];
					men[i] = men[k];
					men[k] = taihi;
				}
			}
		}
		for(int i = 0; i < 2; i++){
			for(int k = i + 1; k < 2; k++){
				if(nomi[i] > nomi[k]){
					taihi2 = nomi[i];
					nomi[i] = nomi[k];
					nomi[k] = taihi2;
				}
			}
		}
		int a = men[0] + nomi[0];
		System.out.println(a);
	}
}