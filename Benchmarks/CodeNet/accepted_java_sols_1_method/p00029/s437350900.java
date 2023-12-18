import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String[] source = sc.readLine().split(" ");
	    Map<String, Integer> wordMap = new HashMap<String, Integer>();
	    int count = 0, wordlength = 0;
	    String wordmax = null, wordcount = null;
	    for(String word : source){
		Integer a = wordMap.get(word);
		if(a == null)
		    a = new Integer(1);
		else
		    a++;
		wordMap.put(word, a);
		if(a>count){
		    count = a;
		    wordcount = word;
		}
		if(word.length() > wordlength){
		    wordlength = word.length();
		    wordmax = word;
		}
	    }
	    System.out.println(wordcount+" "+wordmax);
	}
	catch(Exception e){
	    System.out.println("Error");
	}
    }
}