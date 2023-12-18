import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		while(scan.hasNext()){
			String line = scan.nextLine();
			for(int i = 0; i < 26; i++){
				String now = "";
				StringBuffer sb = new StringBuffer();
				for(int j = 0; j < line.length(); j++){
					char cz = line.charAt(j);
					if(cz >= 'a' && cz <= 'z'){
						char cs = (char)('a' + (cz - 'a' - i) % 26);
					} else{
						char cs = cz;
					}
					sb.append(cs);
				}
				now = sb.toString();
				boolean flag = false;
				for(int j = 0; j < now.length()- 2; j++){
					if(now.charAt(j) == 't' && now.charAt(j + 1) == 'h'
						&& now.charAt(j + 2) == 'e'){
						flag = true;
					}
				}
				for(int j = 0; j < now.length() - 3; j++){
					if(now.charAt(j) == 't' && now.charAt(j + 1) == 'h'){
						if(now.charAt(j + 2) == 'i'
							&& now.charAt(j + 3) == 's'){
							flag = true;
						}
						if(now.charAt(j + 2) == 'a'
							&& now.charAt(j + 3) == 't'){
							flag = true;
						}
					}
				}
				if(flag){
					System.out.printf("%s\n", now);
					break;
				}
			}
		}
}