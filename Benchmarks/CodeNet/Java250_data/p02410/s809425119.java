import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int [][]a=new int [n][m];
int []b=new int [m];
for(int i=0;i<n;i++) {
	for(int s=0;s<m;s++) {
		int A=sc.nextInt();
		a[i][s]=A;
	}
}
for(int q=0;q<m;q++) {
	int B=sc.nextInt();
	b[q]=B;
}
int y;
for(int w=0;w<n;w++) {
	y=0;
	for(int e=0;e<m;e++) {
		y+=a[w][e]*b[e];
	}
	System.out.println(y);
}
sc.close();
  }
}

