import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		
		while(true) {
			int H=in.nextInt(),W=in.nextInt();
			if(H==0)break;
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++)out.print("#");
				out.println();
			}
			out.println();
		}
		
		out.flush();
	}

}

