import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		
		//?????°?????????
		String[] str = new String[2];
		int[] Numbers = new int[2];
		
		//????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder st = new StringBuilder();
		
        while(true){
            String line = br.readLine(); 
        	str = line.split(" ");
        	Numbers[0]=Integer.parseInt(str[0]);
        	Numbers[1]=Integer.parseInt(str[1]);
        	
        	 Arrays.sort(Numbers);
        	        	
            if(Numbers[0] == 0 && Numbers[1] == 0){
                break;
            }
       	 st.append(Numbers[0]).append(" ").append(Numbers[1]).append("\n");
            }
        
        System.out.print(st);
	}
}