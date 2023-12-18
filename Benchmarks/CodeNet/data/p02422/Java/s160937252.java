import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++){
		    String []lines = sc.nextLine().split(" ");
		    
		    if (lines[0].equals("replace")){
		        str = replace(str, Integer.parseInt(lines[1]), Integer.parseInt(lines[2]), lines[3]);
		    }else if (lines[0].equals("reverse")) {
		        str = reverse(str, Integer.parseInt(lines[1]), Integer.parseInt(lines[2]));
		    }else {
		        print(str, Integer.parseInt(lines[1]), Integer.parseInt(lines[2]));
		    }
		}
	}
	
	public static String replace(String str, int start, int end, String replace_str){
	    char []str_to_char = str.toCharArray();
	    char []rstr_to_char = replace_str.toCharArray();
	    
	    for (int i = 0; start+i <= end; i++){
	        str_to_char[start+i] = rstr_to_char[i];
	    }
	    
	    str = String.valueOf(str_to_char);
	   
	    return str;
	}
	
	public static String reverse(String str, int start, int end){
	    char []str_to_char = str.toCharArray();
	    
	    while(end > start){
	        char tmp = str_to_char[start];
	        str_to_char[start] = str_to_char[end];
	        str_to_char[end] = tmp;
	        start++;
	        end--;
	    }
	    
	    str = String.valueOf(str_to_char);
	    
	    return str;
	}
	
	public static void print(String str, int start, int end){
	    char []str_to_char = str.toCharArray();
	    
	    for (; start <= end; start++){
	        System.out.print(str_to_char[start]);
	    }
	    
	    System.out.println();
	}
}
