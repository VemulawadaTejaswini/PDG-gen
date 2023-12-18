import java.util.Scanner;

public class Main  {
    static int getOffset(char c){
	return (int)c - (int)'a';
    }
    
    static char getChar(int offset){
	return (char)((int)'a' + offset);
    }
    static void printabc(int[] abc){
	for(int i=0; i<26;++i){
	    System.out.println(getChar(i) + " : " + abc[i]);
	}
    }
    
    public static void main(String [] args){
	int[] abc = new int[26];
	for(int i=0; i<26;++i){
	    abc[i] = 0;
	}
	
	Scanner sc = new Scanner(System.in);
	while(sc.hasNextLine()){
	    String line = sc.nextLine();
	    line = line.toLowerCase();
	    System.out.println(line);

	    // if(line == ""){

	    // 	return;
	    // }
	    
	    for(int i=0; i<line.length();++i){
		char c = line.charAt(i);

		int offset = getOffset(c);

		if(offset<0 || 25<offset){
		    continue;
		}
		
		abc[offset] += 1;
	    }
	    printabc(abc);
	}


    }

}