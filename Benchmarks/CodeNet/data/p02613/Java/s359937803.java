
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Main {
	static int n;
	static int k;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		HashMap<String,Integer> map=new HashMap<>();
		map.put("AC",0);
		map.put("WA",0);
		map.put("TLE",0);
		map.put("RE",0);
		for(int i=0;i<n;i++)
		{
			String s=br.readLine();
			if(map.containsKey(s))
				map.replace(s,map.get(s)+1);
		}
		System.out.println("AC x "+map.get("AC"));
		System.out.println("WA x "+map.get("WA"));
		System.out.println("TLE x "+map.get("TLE"));
		System.out.println("RE x "+map.get("RE"));
	}

}
