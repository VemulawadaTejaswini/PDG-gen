import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
        int k=0;
        for (int i = 0; i < n; i++) {
			if(i%2==0&&a[i]%2==1){
				k++;
			}
		}
        System.out.println(""+k);
}
}