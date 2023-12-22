import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int youso = sc.nextInt();
		int hairetsu[] = new int[youso];
		for(int i = 0;i < youso;i++) {
			hairetsu[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0;i < youso - 1;i++) {
			for(int j = 0;j < youso - (i + 1);j++) {
				if(hairetsu[j] > hairetsu[j + 1]) {
					int swap = hairetsu[j];
					hairetsu[j] = hairetsu[j + 1];
					hairetsu[j + 1] = swap;
					count++;
				}
			}
		}
		for(int i = 0;i < youso;i++) {
			System.out.printf("%d",hairetsu[i]);
			if(i != youso - 1) System.out.printf(" ");
		}
		System.out.printf("\n%d\n",count);
		sc.close();
	}	
}
