import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for(int i = 0;i < 5;i++){
			num[i] = scan.nextInt();
		}
		for(int i = 0;i < 4;i++){
			for(int j = i+1;j < 5;j++){
				if(num[i] < num[j]){
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		for(int i = 0;i < 5;i++){
			if(i != 4){
				System.out.print(num[i] + " ");
			}else{
				System.out.println(num[i]);
			}
		}
	}
}