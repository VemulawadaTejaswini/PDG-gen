import java.util.*;

public class Main{
	public static void main(String[] args){

		boolean[] s = boolean[13];
		boolean[] h = boolean[13];
		boolean[] c = boolean[13];
		boolean[] d = boolean[13];
		for(int i = 0; i < 13 ; i++){
			s[i] = false;
			h[i] = false;
			c[i] = false;
			d[i] = false;
		}

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] card = String[n];
		for(int i = 0; i < n; i++){
			card[i] = scan.nextLine();
			String[] div = card[i].split("\\s");
			char m = (char) div[0];
			int number = Integer.parseInt(div[1]);
			switch(m){
				case 'S' :
					s[number - 1] = true;
					break;
				case 'H' :
					h[number - 1] = true;
					break;
				case 'C' :
					c[number - 1] = true;
					break;
				case 'D' :
					d[number - 1] = true;
					break;
				default :
					break;
			}
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				switch(i){
					case 0 :
						if(s[j] == false){
							System.out.printf("S %d\n", j + 1);
						}
						break;
					case 1 :
						if(h[j] == false){
							System.out.printf("H %d\n", j + 1);
						}
						break;
					case 2 :
						if(c[j] == false){
							System.out.printf("C %d\n", j + 1);
						}
						break;
					case 3 :
						if(d[j] == false){
							System.out.printf("D %d\n", j + 1);
						}
				}
			}
		}
	}
}