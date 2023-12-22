import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k =sc.nextInt();
	int x=sc.nextInt();
int min=Math.max(-1000000,x-k+1);
int max=Math.min(x+k-1, 1000000);

for(int i=min;i<=max;i++){
	System.out.print(i);
	if(i!=max){
		System.out.print(" ");
	}
}

	}
}