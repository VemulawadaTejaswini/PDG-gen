import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		int pos = 0;
		String[] a = new String [h];
		for(int i = 0; i < h; i++){
			a[i] = br.readLine();
		}
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				char c = a[i].charAt(j);
				if(c=='#'){
					if(j-pos<0 || j-pos>1){
						System.out.println("Impossible");
						return;
					}else{
						pos = j;
					}
				}else{
					if(j==pos){
						System.out.println("Impossible");
						return;
					}
				}
			}
		}
		System.out.println("Possible");
	}
}