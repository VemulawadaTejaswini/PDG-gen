import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
	int k =  sc.nextInt();
	int x[] = new int[n];
	int cou = 0;

	for(int i=0;i<k;i++) {
			int d =  sc.nextInt();
			for(int j=0;j<d;j++) {
				int a = sc.nextInt();
				x[a-1] = 1;
			}
	}
	for(int i=0;i<n;i++) {
		if(x[i]!=1) {
			cou++;
		}
	}
	System.out.println(cou) ;
  }
}