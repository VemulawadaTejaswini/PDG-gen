import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{
	
	public static ArrayList<Integer> return_list(String word){
		ArrayList<Integer> list = new ArrayList<Integer>();
		char[] wArray = word.toCharArray();

		for (int i=0; i < wArray.length; i++){
			if (wArray[i] == 'I') list.add(1);
			else if (wArray[i] == 'V') list.add(5);
			else if (wArray[i] == 'X') list.add(10);
			else if (wArray[i] == 'L') list.add(50);
			else if (wArray[i] == 'C') list.add(100);
			else if (wArray[i] == 'D') list.add(500);
			else list.add(1000);
		}
		
		return list;
	}

	public static int return_number(String word){
		int sum = 0;
		ArrayList<Integer> nlist = new ArrayList<Integer>();

		nlist = return_list(word);
		int i;

		for (i=0; i<nlist.size()-1;i++){
			if(nlist.get(i) >= nlist.get(i+1))sum+=nlist.get(i);
			else {
				sum += nlist.get(i+1) - nlist.get(i);
				i++;
			}
		}
		if(i<nlist.size())sum += nlist.get(i);

		return sum;
	}
	public static void print_number(ArrayList<String> list){
		for (int i=0; i<list.size();i++ ){
			System.out.println(return_number(list.get(i)));
		}
	}

	public static void main(String args[]) throws IOException{
		String str;
		ArrayList<String> inp = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			str = scan.next();
			inp.add(str);
		}
		print_number(inp);
	}
}