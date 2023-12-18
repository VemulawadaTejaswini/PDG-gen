import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		String text, dec = "";

		while(sc.hasNext()){
			text = sc.next();
			i = 0;
			dec = "";
			while(i < text.length()){
				if(text.charAt(i) == '@'){
					for(int j = 0; j < Integer.parseInt("" + text.charAt(i + 1)); j++){
						dec += text.charAt(i + 2);
					}
					i += 3;
				}else{
					dec += text.charAt(i);
					i++;
				}
			}
			System.out.println(dec);
		}
	}
}