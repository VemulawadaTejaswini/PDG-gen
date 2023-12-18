import java.util.*;

public class Main
{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] sentences = sc.nextLine().split(" ");
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    
	    for(String sentence : sentences){
		if(map.get(sentence) == null){
		    map.put(sentence, 1);
		} else {
		    int count = (Integer)map.get(sentence);
		    map.put(sentence, count+1);
		}
	    }

	    Set key_list = map.keySet();
	    Iterator iter = key_list.iterator();
	    String str_max_length, str_freq;
	    str_max_length = str_freq = (String)iter.next();

	    while(iter.hasNext()){
		String str_key = (String)iter.next();

		str_max_length = compMaxLength(str_max_length, str_key);
		str_freq = compFreqSentence(str_freq, str_key, map);
	    }

	    System.out.println(str_freq+" "+str_max_length);
	}
    }

    private static String compMaxLength(String str1, String str2){
	return (str1.length() > str2.length())? str1 : str2;
    }

    private static String compFreqSentence(String str1, String str2, HashMap map){
	return ((Integer)map.get(str1) > (Integer)map.get(str2))? str1 : str2;
    }
}