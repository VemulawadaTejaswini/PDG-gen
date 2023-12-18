import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		String n = sc2.nextLine();
		
		while(sc2.hasNextLine()){
			String[] s= sc2.nextLine().split("[\\s]+");
			for(int i=0;i<s.length;i++){
				if(s[i].equals("END_OF_TEXT")) {
					System.out.println(count);
					return;
				}
				else{
					if(s[i].equalsIgnoreCase(n)) count++;
				}
			}
		}
	}
}