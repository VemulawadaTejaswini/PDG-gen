import java.io.*;

public class Practice  {
	public static void main(String[] args)throws IOException {
		int a,b;
		for(a = 1;a<10;a++){
			for(b = 1;b<10;b++){
				System.out.println(a + "x" + b + "=" + a*b);
			}
		}
		return;
	}
}