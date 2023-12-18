import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		char[] in = s.next().toCharArray();
		for(int i=0;i<in.length;i++)
			in[i]=(char) (((in[i]-'A'-3+26)%26)+'A');
		System.out.println(Arrays.toString(in).replaceAll("[\\[,\\] ]",""));
	}
}