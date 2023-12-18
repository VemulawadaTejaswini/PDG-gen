import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] c = new int[10];
			while(n--!=0)c[sc.nextInt()]++;
			for(int i=0;i<10;i++){
				if(c[i]==0)System.out.print("-");
				else for(int j=0;j<c[i];j++)System.out.print("*");
				System.out.println();
			}
		}
	}
}