import java.io.*;
public class plus{
    public static void main(String[] args){
	int sum = 0;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try{
	    while(sum <= 1000){
		String line = reader.readLine();
		if(line.equals("0")){
		    break;
		}
		for(int i = 0; i < line.length(); i++){
		    char ch = line.charAt(i);
		    try{
			sum += Character.getNumericValue(ch);
		    } catch(NumberFormatException e) {
		    }
		}
		System.out.println(sum);
		sum = 0;
	    }
	} catch (IOException e){
	    System.out.println(e);
	}
    }
}