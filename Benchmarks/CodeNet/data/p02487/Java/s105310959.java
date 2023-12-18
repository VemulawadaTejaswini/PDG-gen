import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		while(true){
			ia = in.readLine().split(" ");
			int h = Integer.parseInt(ia[0]);
			int w = Integer.parseInt(ia[1]);
			if(h == 0 && w == 0){
				break;
			}
			for(int i = 0;i < h; ++i){
				for(int j = 0;j < w; ++j){
					if(i == 0 || i == h-1 || j == 0 || j == w-1){
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}