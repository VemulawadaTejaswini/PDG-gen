import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try{
			String line = reader.readLine();
			int money = Integer.parseInt(line);

			int fiveHundreds = money/500;
			int five = (money%500)/5;

			int happy = 1000*fiveHundreds + 5*five;

			System.out.println(happy);

		} catch (IOException e){
			System.out.println(e);
			System.exit(0);
		} catch (NumberFormatException e){
			System.out.println(e);
			System.exit(0);
		}
	}
}