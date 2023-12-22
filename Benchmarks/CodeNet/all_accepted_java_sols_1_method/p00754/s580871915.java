import java.util.*;
import java.io.*;
class Main{
    public static void main (String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true){
	    try{
		String text = br.readLine();
		if(text.equals("."))break;
		char word[] = text.toCharArray();
		LinkedList<Character> list = new LinkedList<Character>();
		for(int i = 0; i < word.length;i++){
		    if(word[i] == ']'){
			if(!list.isEmpty()){
			    if(list.getLast() == '['){
				list.removeLast();
			    }else{
				list.add(word[i]);
			    }
			}else{
			    list.add(word[i]);
			}
		    }else if(word[i] == ')'){
			if(!list.isEmpty()){
			    if(list.getLast() == '('){
				list.removeLast();
			    }else{
				list.add(word[i]);
			    }
			}else{
			    list.add(word[i]);
			}
		    }else if(word[i] == '(' ){
			list.add(word[i]);
		    }else if(word[i] == '['){
			list.add(word[i]);
		    }
		}
		if(list.size() == 0 ){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	    }catch(IOException e){
	    }
	}
    }
}