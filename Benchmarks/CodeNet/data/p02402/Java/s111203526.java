import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=0;
		String s = sc.nextLine();
		s = sc.nextLine();
		String[] st = s.split(" ");
		int[] a = new int[st.length];
		for(int i=0;i<a.length;i++){
			a[i] = Integer.parseInt(st[i]);
		}
		Arrays.sort(a);
		for(int i:a){
			n+=i;
		}
		System.out.println(a[0]+" "+a[a.length-1]+" "+n);
	}
}