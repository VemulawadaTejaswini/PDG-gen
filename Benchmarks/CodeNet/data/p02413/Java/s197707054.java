import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int [][]a=new int [r+1][c+1];
int goukei=0;
for(int i=0;i<r;i++) {
	int sum=0;
	for(int o=0;o<c;o++) {
		int n=sc.nextInt();
		a[i][o]+=n;
		sum+=n;
		goukei+=n;
		a[r][o]+=n;
	}
	a[i][c]+=sum;
}
a[r][c]=goukei;
for(int q=0;q<=r;q++) {
	for(int w=0;w<=c;w++) {
		if(w>0) {
			System.out.print(" ");
		}
		System.out.print(a[q][w]);
	}
	System.out.println();
}
sc.close();
  }
}

