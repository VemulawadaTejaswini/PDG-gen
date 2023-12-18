import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		for(;;){
			Scanner scan = new Scanner(System.in);
			String text = scan.nextLine();
			if(text.equals(".")) break;
			String word[] = text.split("");
			int i;
			int j = 0;
			int[] t = new int[100];
			for(i = 0; i < text.length(); i++){
				if(word[i].equals("(")){
					t[j] = 1;
					j++;
				}
				else if(word[i].equals("[")){
					t[j] = 2;
					j++;
				}
				else if(word[i].equals(")")){
					if(t[j - 1] == 1){
						t[j - 1] = 0;
						j--;
						}
				}
				else if(word[i].equals("]")){
					if(t[j - 1] == 2){
						t[j - 1] = 0;
						j--;
					}
				}
			}
			int p = 0;
			for(i = 0; i < t.length; i++){
				if(t[i] == 0) p++;
				else continue;
			}
			if(p == t.length) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
			