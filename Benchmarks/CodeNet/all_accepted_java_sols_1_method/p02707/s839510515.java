import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n-1];
		int[] data2 = new int[n];
		for(int i=0;i<n-1;i++)
			data[i] = sc.nextInt();
		for(int i=0;i<n-1;i++)
			data2[data[i]-1]++;
		for(int i=0;i<n;i++)
			System.out.println(data2[i]);
	}
}

