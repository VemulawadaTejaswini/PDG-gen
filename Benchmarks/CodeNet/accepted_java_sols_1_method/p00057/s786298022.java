import java.util.Scanner;

//The Number of Area
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10001];
		a[0] = 1;
		for(int i=1;i<10001;i++)a[i]=a[i-1]+i;
		while(sc.hasNext())System.out.println(a[sc.nextInt()]);
	}
}