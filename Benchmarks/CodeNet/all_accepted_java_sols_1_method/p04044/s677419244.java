import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int l = scn.nextInt();
		String[] s = new String[n];
		for(int i=0; i<n; i++){
			s[i] = scn.next();
		}
      	Arrays.sort(s);
      	for(int i=0; i<n; i++) System.out.print(s[i]);
	}
}