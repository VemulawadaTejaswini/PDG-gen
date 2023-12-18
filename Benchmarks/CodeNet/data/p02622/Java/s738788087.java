import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	char[] list1 = reader.readLine().toCharArray();
	char[] list2 = reader.readLine().toCharArray();
	long res = 0;
	for(int i = 0;i<list1.length;i++){
		if(list1[i]!=list2[i]) res++;
	}
	System.out.println(res);
	}
}
