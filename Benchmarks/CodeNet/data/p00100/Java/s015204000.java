import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
				int n = Integer.valueOf(sc.readLine());
				if(n==0)
					break;
				Map<String,Long> map = new HashMap<String,Long>();
				String[] key = new String[n];
				int a = 0;
				for(int i=0; i<n; i++){
					String[] st = sc.readLine().split(" ");
					if(map.containsKey(st[0])){
						long t = map.get(st[0])+Integer.valueOf(st[1])*Integer.valueOf(st[2]);
						map.remove(st[0]);
						map.put(st[0],t);
					}
					else {
						long t = Integer.valueOf(st[1])*Integer.valueOf(st[2]);
						map.put	(st[0],t);
						key[a]=st[0];
						a++;
					}
				}
			boolean flag = true;
			for(int i=0; i<n; i++){
				if(key[i]==null)
					break;
				if(map.get(key[i])>=1000000){
					System.out.println(key[i]);
					flag = false;
				}
			}
			if(flag)
				System.out.println("NA");
			}
		}catch(Exception e){
			System.out.println("Error");
			}
		}
}