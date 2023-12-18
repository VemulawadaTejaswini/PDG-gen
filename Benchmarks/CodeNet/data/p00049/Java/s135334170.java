import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str,arr[];
		List<String> list = new ArrayList<String>();
		while(null!=(str = in.readLine())){
			arr = str.split(",",0);
			list.add(arr[1]);
		}
		System.out.println(count("A",list));
		System.out.println(count("B",list));
		System.out.println(count("AB",list));
		System.out.println(count("O",list));
	}

	private static long count(String bl,List<String> list){
		List<String> lis = new ArrayList<String>(list);
		int i=0;
		while(lis.remove(new String(bl)))i++;
		return i;
	}
}