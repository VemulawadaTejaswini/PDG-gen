import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), l=sc.nextInt();
		sc.nextLine();
		String res="";
		String[] str=new String[n];
		for(int i=0; i<n; ++i) str[i]=sc.nextLine(); 
		Collections.sort(Arrays.asList(str));
		for(int i=0; i<n; ++i) res+=str[i];
		System.out.println(res);
		sc.close(); 
	}

}