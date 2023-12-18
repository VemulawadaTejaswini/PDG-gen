import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				pw.printf("%dx%d=%d\n",i,j,i*j);
			}
		}
		pw.close();
		sc.close();
	}
}