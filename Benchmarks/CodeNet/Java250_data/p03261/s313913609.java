import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] array=new String[n];
		String buff1="",buff2="";

		for(int i=0;i<n;i++) {
			array[i]=sc.next();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i].equals(array[j])) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		for(int i=0;i<n-1;i++) {
			buff1=array[i].substring(array[i].length()-1,array[i].length());
			buff2=array[i+1].substring(0,1);
			if(!buff1.equals(buff2)) {
				System.out.println("No");
				System.exit(0);
			}
		}

		System.out.println("Yes");
	}
}


