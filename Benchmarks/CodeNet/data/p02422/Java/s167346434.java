import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	String str = scan.nextLine();
    	int num = scan.nextInt();
    	
    	String meirei;
    	String change = "";
    	String find;
    	int begin;
    	int end;
    	
    	for(int i = 0; i < num; i++){
	    	meirei = scan.next();
	        begin = scan.nextInt();
	        end = scan.nextInt();
	    	
	    	String replace = "";
	    	String output = "";
	    	
	    	if(meirei.equals("replace")){
	    		replace = scan.next();
	    	}
	    	
	    	if(meirei.equals("print")){
	    		System.out.println(str.substring(begin, end + 1));
	    	}else if(meirei.equals("reverse")){
	    		find = str.substring(begin, end + 1);
	    		for(int j = find.length() - 1; j >= 0; j--){
	    			change += find.charAt(j);
	    		}
	    		str = str.replaceAll(find, change);
	    	}else{
	    		find = str.substring(begin, end + 1);
	    		str = str.replaceAll(find, replace);
	    	}
    	}
    	
     }
}