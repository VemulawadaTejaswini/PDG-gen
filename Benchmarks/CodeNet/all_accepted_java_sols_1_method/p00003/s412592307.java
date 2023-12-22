import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String args[]){
		for(int i=s.nextInt(); i>0; i--){
			int[] in={s.nextInt(),s.nextInt(),s.nextInt()};
			Arrays.sort(in);
			System.out.println(
					in[2]*in[2]==(in[1]*in[1]+in[0]*in[0])
					?"YES":"NO");
		}
	}
}