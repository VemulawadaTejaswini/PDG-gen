import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		int i;
		int[] a = new int[3];
		Scanner scan = new Scanner(System.in);
			for(i=0;i<3;i++){
			a[i] = Integer.parseInt(scan.next());
			}
			for(i=0;i<3;i++){
				for(int j=i+1;j<3;j++){
					if(a[i]>a[j]){
						int b = a[i];
						a[i] = a[j];
						a[j] = b;
					}
				}
			}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}
}