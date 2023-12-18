import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0,b=0;
		while(s.hasNext()){
		    String[] c = s.next().split(",");
		    int[] in = new int[3];
		    for(int i=0 ; i<3 ; i++)
			in[i] = Integer.parseInt(c[i]);
		    if(in[0]*in[0]+in[1]*in[1]==in[2]*in[2])
			a++;
		    else{
			if(in[0]*in[0]+in[2]*in[2]!=in[1]*in[1]&&in[2]*in[2]+in[1]*in[1]!=in[0]*in[0])
			b++;
		    }

		}
		System.out.println(a);
		System.out.println(b);
	}
}