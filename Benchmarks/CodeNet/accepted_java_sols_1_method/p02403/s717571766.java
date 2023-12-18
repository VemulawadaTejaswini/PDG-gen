import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();
			String[] str = line.split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			if ( h == 0 && w == 0 ){ //??\????????¨??????0
				break;
			}

			for (int i = 0; i < h ; i++ ) {
				for (int k = 0; k < w ; k++ ) {
					System.out.print("#");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}