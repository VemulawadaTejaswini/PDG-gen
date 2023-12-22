import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
    public static void main(String[] args) {
        try {
			final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			final String word = input.readLine();
			int count = 0;
			boolean flag = true;
			while(flag){
			    for(final String str : input.readLine().split(" ")){
			    	if (str.equals("END_OF_TEXT")) {
			    		flag = false;
			    	} else if(str.equalsIgnoreCase(word)){
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