import java.io.*;
public class Main {
		public static void main(String[] arg) throws IOException {
			InputStreamReader is = new InputStreamReader(System.in); 
	        BufferedReader br = new BufferedReader(is);
			String str = br.readLine();
			String[] spl = str.split(" ");
			int[] array = new int[spl.length];

			for(int i = 0 ; i < spl.length ; i++){
				array[i] = Integer.parseInt(spl[i]);
			}
			if(array[2]-array[4]>=0&&array[2]+array[4]<=array[0] &&
					array[3]-array[4]>=0&&array[3]+array[4]<=array[1]){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
	}

}