import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, i, num;
		int ct = 0;
		int ass[] = new int[510];
		
		n = input.nextInt();
		for (i = 0; i < n; i++){
			num = input.nextInt();
			ass[num] = 1;
		}
		n = input.nextInt();
		for (i = 0; i < n; i++){
			num = input.nextInt();
			if (ass[num] == 1){
				ct++;
			}
		}
		System.out.println(ct);
	}
}