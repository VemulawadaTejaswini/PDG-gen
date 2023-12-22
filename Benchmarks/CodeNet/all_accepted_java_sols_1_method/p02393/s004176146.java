import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		 String[] aaa = str.split(" ");
	
		 int count = aaa.length;
		 int[] bbb = new int[count];
		 
		 for(int i = 0; i < bbb.length;i++) {
			 bbb[i] = Integer.parseInt(aaa[i]);
		 }
		 

	    Arrays.sort(bbb);

	    System.out.println(bbb[0] +" "+ bbb[1] + " " + bbb[2]);

	    
	}
}