import java.util.Scanner;

//20180510
//04

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String[] list = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] count = new int[list.length];

		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();
			char[] cha = str.toCharArray();

			for(int i = 0;i < cha.length;i++) {
				for(int j = 0;j < list.length;j++) {
					String up = String.valueOf(Character.toUpperCase(cha[i]));
					String lo = String.valueOf(Character.toLowerCase(cha[i]));
					if(list[j].equals(up) || list[j].equals(lo)) {
						count[j]++;
					}
				}
			}
		}
		for(int j = 0;j < list.length;j++) {
			System.out.printf("%s : %d\n",list[j],count[j]);
		}
		scanner.close();
    }
}
