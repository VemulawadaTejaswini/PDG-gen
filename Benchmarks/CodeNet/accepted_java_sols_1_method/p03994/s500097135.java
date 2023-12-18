import java.util.*;
public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String __[]){
		char[] in=s.next().toCharArray();
		int k=s.nextInt();
		for(int i=0;i<in.length;i++) {
			if(in[i]!='a'&&'z'-in[i]<k) {
				k-='z'-in[i]+1;
				in[i]='a';
			}
		}
		k%=26;
		in[in.length-1]=(char) (((in[in.length-1]-'a'+k)%26)+'a');
		System.out.println(String.valueOf(in));
	}
}
