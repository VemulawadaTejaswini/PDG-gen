import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);

	int[] alpha = new int[26];
	for(int i = 0 ; i < 26 ; i++) alpha[i] = 0;
	
	while(s.hasNext()){
	    String str = s.nextLine();
	    String st = str.toLowerCase();
	    //System.out.println("OK");
	    for(int i = 0 ; i < st.length() ; i++){
		char c = st.charAt(i);
		if('a' <= c && c <= 'z') alpha[c - 'a']++;
		else continue;
	    }
	}
	for(int i = 0 ; i < 26 ; i++){
	    System.out.println((char)('a' + i) + " : " + alpha[i]);
	}	
    }
}