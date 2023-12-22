import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i,j;
		int[] n = new int[990];
		String[] str = new String[990];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			str = in.readLine().split(" ");
			for(i=0;i<2;i++){
				n[i] = Integer.parseInt(str[i]);
			}
			if(n[0]+n[1]==0) break;
			for(i=0;i<n[0];i++){
				for(j=0;j<n[1];j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}