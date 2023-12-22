import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt(), res=0;
		int[] s=new int[k*2];
		for(int i=0; i<k*2; ++i) s[i]=sc.nextInt();
		Arrays.sort(s);
		for(int i=0; i<k*2; i+=2)  res+=s[i];
		System.out.println(res);
		sc.close(); 
	}

}