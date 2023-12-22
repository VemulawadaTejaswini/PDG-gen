import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		String input;
		int [][] a = new int[26][2];
		for(int i = 0; i < 26;i++){
			a[i][0] = 97+i;
		}
		char [] c2;
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	while((input = br.readLine()) != null){
    		input = input.toLowerCase();
    		c2 = input.toCharArray();
    		for(int i = 0;i < c2.length;i++ ){
    			for(int j = 0; j< 26;j++){
    				if(c2[i] == a[j][0]) a[j][1]++;
    			}
    		}
    	}
    	br.close();

    	for(int i = 0; i < 26; i++){
    		System.out.println((char)a[i][0] +" : "+a[i][1]);
    	}
    }
}