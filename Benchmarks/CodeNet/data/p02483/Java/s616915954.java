import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int taihi;
		int[] box = {a,b,c};
		for(int i = 0; i < 2; i++){
			for(int j = i+1; j <= 2; j++){
				if(box[i] > box[j]){
					taihi = box[i];
					box[i] = box[j];
					box[j] = taihi;
				}
			}
		}
		System.out.println(box[0] + " " + box[1] + " " + box[2]);
	}
}