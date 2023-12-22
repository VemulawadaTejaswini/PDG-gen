import java.util.Scanner;

public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);

	int n=scanner.nextInt();
	Integer[] m=new Integer[n];
	int t=0;


	for(int j=0;j<n;j++) {
		int a=scanner.nextInt();
		m[j]=a;
	}

	for(int i=0;i<n;i++) {
		if((i+1)%2==1) {
			if(m[i]%2==1) {
				t=t+1;
			}
		}
	}

	System.out.println(t);


	 }
}