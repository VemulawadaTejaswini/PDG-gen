import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int [10];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int j=10;j<7;j--){
			System.out.println(a[j]);
		}
		

 }
}