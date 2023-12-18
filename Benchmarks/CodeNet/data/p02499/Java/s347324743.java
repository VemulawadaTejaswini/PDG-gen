import java.util.Scanner;
import java.util.*;
import java.lang.Character.*;
public class Main {

    static int chartoint(char c){
	char cl = Character.toLowerCase(c);
	if('a' <= cl && cl <= 'z'){
	    return (int)cl - (int)'a';	    
	}else{
	    return 27;
	}

    }
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int[] alphabets = new int[28];
	String line = sc.nextLine();
	for(int i=0; i<line.length();++i){
	    int j = chartoint(line.charAt(i));
	    alphabets[j] += 1;
	}
	for(int i=0; i<26;++i){
	    char chidx = (char)((int)'a' + i);
	    System.out.println(chidx + " : " + alphabets[i]);
	}
    }
}