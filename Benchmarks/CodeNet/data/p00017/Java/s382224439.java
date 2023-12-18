import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan.useDelimiter("\\r\\n");
		while(scan.hasNext()){
        	String str = scan.next();
            char ch[] = new char[80];
        	int n = str.length();
        	for(int i = 0; i < 26;i++){
        		ch = str.toCharArray();
        		for(int j = 0;j < n;j++){
        			if (ch[j] != '.' && ch[j] != ' '){
                        ch[j] = (char) ('a' + (ch[j] - 'a' + i) % 26);
        			}
        		}
        		String string = String.valueOf(ch);
        		if(string.indexOf("the") + string.indexOf("this") + string.indexOf("that") > -3){
        			System.out.println(string);
        			break;
        		}
        	}
        }
		System.exit(0);
	}
}