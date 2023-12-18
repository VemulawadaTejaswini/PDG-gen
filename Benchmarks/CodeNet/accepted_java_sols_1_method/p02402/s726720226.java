import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		long n=0;
		String s = sc.nextLine();
		s = sc.nextLine();
		String[] st = s.split(" ");
		long[] a = new long[st.length];
		for(int i=0;i<a.length;i++){
			a[i] = Long.parseLong(st[i]);
		}
		Arrays.sort(a);
		for(long i:a){
			n+=i;
		}
		System.out.println(a[0]+" "+a[a.length-1]+" "+n);
	}
}