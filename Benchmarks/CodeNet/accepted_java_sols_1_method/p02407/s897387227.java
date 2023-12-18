import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] a=new int[n];
for(int i=0;i<n;i++) {
	 a[i]=sc.nextInt();
}
for(int o=n-1;o>=0;o--) {
	if(o==0) {
		System.out.println(a[o]);
	}
	else {
		System.out.print(a[o]+" ");
	}
}
sc.close();
  }
}




