import java.util.Scanner;
import java.util.regex.*;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int n = new Scanner(stdin.nextLine()).nextInt();
	for(int i = 0; i < n; i++){
	    StringBuilder sb = new StringBuilder(stdin.nextLine());
	    String s = stdin.nextLine();
	    int k = 0;
	    if(!s.equals("")){
		k = new Scanner(s).nextInt();
	    }
	    int cursor = 0;
	    for(int j = 0; j < k; j++){
		String input = stdin.nextLine();
		if(input.equals("forward char")){
		    if(cursor < sb.length()){
			cursor++;
		    }
		} else if(input.equals("delete char")){
		    if(cursor < sb.length()){
			sb.deleteCharAt(cursor);
		    }
		} else if(input.equals("forward word")){
		    while(cursor < sb.length() && sb.charAt(cursor) == ' '){
			cursor++;
		    }
		    while(cursor < sb.length() && sb.charAt(cursor) != ' '){
			cursor++;
		    }
		} else if(input.equals("backward char")){
		    if(cursor > 0){
			cursor--;
		    }
		} else if(input.equals("backward word")){
		    while(cursor > 0 && sb.charAt(cursor - 1) == ' '){
			cursor--;
		    }
		    while(cursor > 0 && sb.charAt(cursor - 1) != ' '){
			cursor--;
		    }			  
		} else if(input.equals("delete word")){
		    while(cursor < sb.length() && sb.charAt(cursor) == ' '){
			sb.deleteCharAt(cursor);
		    }
		    while(cursor < sb.length() && sb.charAt(cursor) != ' '){
			sb.deleteCharAt(cursor);
		    }
		} else { //insert
		    Pattern p = Pattern.compile("\"(.+)\"");
		    Matcher m = p.matcher(input);
		    m.matches();
		    if(m.find()){
			sb.insert(cursor, m.group(1));
			cursor += m.group(1).length();
		    }			
		}
	    }
	    sb.insert(cursor, '^');
	    System.out.println(sb);
	}
    }
}