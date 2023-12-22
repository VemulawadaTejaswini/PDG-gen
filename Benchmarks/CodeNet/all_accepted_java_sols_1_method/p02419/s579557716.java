import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
    public static void main(String[] args) {
        try {
			final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			final String key = input.readLine();
			int count = 0;
			boolean flag = true;
			String[] strs;
			while(flag){
			    strs = input.readLine().split(" ");
			    for(final String str : strs){
			    	if (str.equals("END_OF_TEXT")) {
			    		flag = false;
			    	} else if(str.equalsIgnoreCase(key)){
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