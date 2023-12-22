import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int count =0;
		String [] keys =new String[256];
		Hashtable<String,Integer> index = new Hashtable<String,Integer>();
		while(scan.hasNext()){
			String str = scan.next();
			if(index.containsKey(str)){
				int value = index.get(str);
				index.remove(str);
				index.put(str,value+1);
			}
			else{
				index.put(str,0);
				keys[count++]=str;
			}

		}
		int max =0;
		int maxlen =0;
		String strf="",strl="";
		for(int i=0;i<count;i++){

			if(index.get(keys[i])>=max){
				max = index.get(keys[i]);
				strf =keys[i];
			}

			if(keys[i].length()>= maxlen){
				maxlen=keys[i].length();
				strl =keys[i];
			}

			}
		System.out.println (strf+" "+strl);
		}
}