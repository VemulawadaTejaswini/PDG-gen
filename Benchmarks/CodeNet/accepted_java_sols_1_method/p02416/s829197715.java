import java.util.*;

public class Main {
	private static Scanner sc=new Scanner(System.in);;

	public static void main(String args[]) {
		//System.out.println((int)'1');
		while(sc.hasNextLine()){
			char a[]=sc.nextLine().toCharArray();
			if(a[0]==48)break;
			int ans=0;
			for(int i=0;i<a.length;i++){

				ans+=a[i]-48;
			}
			System.out.println(ans);
		}
	}
}