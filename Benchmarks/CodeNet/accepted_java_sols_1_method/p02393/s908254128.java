import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int [] a = new int[4];
		
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();
		int i, j;
		for (i = 1;i <= 2;i++){
			a[3] = a[i];
			for(j = i - 1;j >= 0 && a[j] > a[3];j--){
				a[j + 1] = a[j];
			}
			if(j != i - 1){
				a[j + 1] = a[3];
			} 
		}
		System.out.print(a[0] + " ");
		System.out.print(a[1] + " ");
		System.out.println(a[2]);
		scan.close();
	}
}
