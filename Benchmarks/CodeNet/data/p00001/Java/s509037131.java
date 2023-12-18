import java.io.DataInputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		DataInputStream d = new DataInputStream(System.in);
		int a[] = new int[10];
		int b[] = new int[3];
		b[0]=b[1]=b[2]=0;
		for(int i = 0;i <=9;i++){
			 String s = d.readLine();	 
			a[i] = Integer.parseInt(s);
		}
		java.util.Arrays.sort(a);
		for(int i = 9;i >=7;i--){
			System.out.println(a[i]);
		}
		System.exit(0);
	}
}