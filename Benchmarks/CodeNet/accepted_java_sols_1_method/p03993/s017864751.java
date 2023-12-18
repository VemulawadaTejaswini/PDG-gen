import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int in[] = new int[s.nextInt()],res=0;
		Arrays.fill(in, -1);
		for(int i=0;i<in.length;i++) {
			in[i]=s.nextInt()-1;
		}
		for(int i=0;i<in.length;i++) {
			if(in[in[i]]==i) {
				res++;
				//System.out.println(i);
			}
		}
		System.out.println(res/2);
	}
}