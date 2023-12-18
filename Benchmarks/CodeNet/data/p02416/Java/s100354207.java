import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int count=0;
			String[] s=sc.next().split("");

			int[] a=new int[s.length];
			for(int i=0; i<s.length; i++){
			a[i]=Integer.parseInt(s[i]);
			count+=a[i];
			}
			if(a[0]!=0){

			System.out.println(count);
			}
		}

	}

}
