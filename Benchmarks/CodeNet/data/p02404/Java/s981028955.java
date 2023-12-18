import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br =new BufferedReader(new FileReader("file01.txt"));
		String[] str = null;
		do {
			str = br.readLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			
			for(int i=0;i<h;i++){
				System.out.print("#");
				for(int l=0;l<w;l++){
					if(i==0|i==h-1){System.out.print("#");
					}else System.out.print(".");
				}System.out.println("#");
				}System.out.println();System.out.println();
		}while (!(str[1].equals("0") && str[0].equals("0")));

	}
}