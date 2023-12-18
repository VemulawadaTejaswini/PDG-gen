import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		char[]c=s.next().toCharArray();
		Arrays.sort(c);
		System.out.println(c[0]==c[1]&&c[2]==c[3]&&c[1]!=c[2]?"Yes":"No");
	}
}
