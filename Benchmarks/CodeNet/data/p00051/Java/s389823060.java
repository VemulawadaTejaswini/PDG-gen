import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, seq, tmp;
		int i, j, res;
		int num[] = new int[10];
		
		n = input.nextInt();
		for (; n > 0; n--){
			seq = input.nextInt();
			for (i = 0; i < 8; i++){
				num[i] = seq % 10;
				seq /= 10;
			}
			for (i = 0; i < 7; i++){
				for (j = i + 1; j < 8; j++){
					if (num[i] > num[j]){
						tmp = num[i];
						num[i] = num[j];
						num[j] = tmp;
					}
				}
			}
			res = 0;
			for (i = 0; i < 8; i++){
				res *= 10;
				res += (num[7 - i] - num[i]);
			}
			System.out.println(res);
		}
	}
}