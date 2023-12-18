import java.util.Scanner;
class Main{
	public static void main(String[] amge){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a [] = new int[n];
		int max;
		int min;
		int tot = 0;
		for(int x = 0;x < n;x++){
			a[x] = scan.nextInt();
		}
		max = a[0];
		min = a[0];
		for(int y = 0;y < n;y++){
			if(max < a[y]){
				max = a[y];
			}
		}
		for(int t = 0;t < n;t++){
			if(min > a[t]){
				min = a[t];
			}
		}
		for(int k = 0;k < n;k++){
			tot = tot +a[k];
		}
		System.out.println(min +" "+ max +" "+ tot);
	}
}