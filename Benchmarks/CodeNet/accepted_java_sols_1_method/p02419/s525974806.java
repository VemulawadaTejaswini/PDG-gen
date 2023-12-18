import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
    public static void main(String[] args) {
        try {
			final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			final String key = input.readLine();
			int count = 0;
			String[] strs;
			while(true){
			    strs = input.readLine().split(" ");
			    if (strs[0].equals("END_OF_TEXT")) {
			    	break;
			    }
			    for(int i = 0; i < strs.length; i++){
			        final String str = strs[i];
			        if(str.equalsIgnoreCase(key)){
			            count++;
			        }
			    }
			}
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}