import java.util.*;

public class Main {
	private static Scanner sc=new Scanner(System.in);;

	public static void main(String args[]) {
		char []a=sc.nextLine().toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]>=97&&a[i]<=122){
				a[i]-=32;
			}else if(65<=a[i]&&a[i]<=90){
				a[i]+=32;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();
		/*System.out.println((int )'a'+" "+(int)'z');
		System.out.println((int)'A'+" "+(int)'Z');
		System.out.println((int)'a'-'A');
		System.out.println((int)'z'-'Z');
		 */
	}
}