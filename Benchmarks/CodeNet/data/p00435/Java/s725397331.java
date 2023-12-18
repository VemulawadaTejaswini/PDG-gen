import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		char[] in = s.next().toCharArray();
		for(int i=0;i<in.length;i++)
			in[i]=(char) ((in[i]+'Z'-3)%('Z'));
		System.out.println(Arrays.toString(in).replaceAll("[\\[,\\] ]",""));
	}
}