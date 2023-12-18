 public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	String str = scan.nextLine();
    	char[] str_c = new char[str.length()];
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
	    	
	    	for(int k = 0; k < str.length(); k++){
	    		str_c[k] = str.charAt(k);
	    	}
	    	
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
	    		for(int j = begin; j < end + 1; j++){
    				str_c[j] = change.charAt(j - begin);	
    			}
	    		str = String.valueOf(str_c);
	    	}else{
    			for(int j = begin; j < end + 1; j++){
    				str_c[j] = replace.charAt(j - begin);
    				
    			}
	    		str = String.valueOf(str_c);
	    	}
    	}
    	
     }