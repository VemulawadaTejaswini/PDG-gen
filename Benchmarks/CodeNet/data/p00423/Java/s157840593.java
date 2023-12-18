import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, a, b, sumA, sumB;
		while((n = sc.nextInt()) != 0){
			sumA = sumB = 0;
			for(int i = 0; i < n; i++){
				a = sc.nextInt();
				b = sc.nextInt();
				if(a > b){
					sumA += a + b;
				}else if(a < b){
					sumB += a + b;
				}else{
					sumA += a;
					sumB += b;
				}
			}
			System.out.println(sumA + " " + sumB);
		}
	}
}