public class AppleAndPeach {
	
	public static void main(String args[]) throws Exception {

		System.out.println("input letters >");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        String output = input.replaceAll("peach","value");
        
        output = output.replaceAll("apple", "peach");
        
        output = output.replaceAll("value", "apple");
        
        System.out.println(output);

	}

}