import java.util.Scanner;
public class Main{
	public static  void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<a.length;i++){
		a[i] = scan.nextInt();
		}
		for(int i=0;i<a.length-1;i++){
			for(int j=a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
				System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}
}