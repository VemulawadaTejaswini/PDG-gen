import java.util.Scanner;

//20180510
//03

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			char[] cha = str.toCharArray();

			for(int i = 0;i < cha.length;i++) {
				if(Character.isLowerCase(cha[i])) {
					cha[i] = Character.toUpperCase(cha[i]);
				} else 	if(Character.isUpperCase(cha[i])) {
					cha[i] = Character.toLowerCase(cha[i]);
				}
			}

			String output = String.valueOf(cha);
			System.out.print(output);
		}
		System.out.println();
		scanner.close();
    }
}
