import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Data>list = new ArrayList<Data>(n);
		for(int i = 0; i < n; i++) {
			String title = sc.next();
			String author = sc.next();
			Calendar date = Calendar.getInstance();
			date.clear();
			String[] datex = sc.next().split("/");
			
			date.set(Integer.parseInt(datex[0]),Integer.parseInt(datex[1]),Integer.parseInt(datex[2]));
			list.add(new Data(title,author,date));
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			if(i != 0) System.out.println();
			ArrayList<Data> ok = new ArrayList<Data>();
			ArrayList<Data> ok2 = new ArrayList<Data>();
			String title = sc.next();
			String author = sc.next();
			Calendar from = Calendar.getInstance();
			from.clear();
			String[] datex = sc.next().split("/");
			if(datex[0].equals("*")) from.set(1970, 1,1);
			else from.set(Integer.parseInt(datex[0]),Integer.parseInt(datex[1]),Integer.parseInt(datex[2]));
			Calendar to   = Calendar.getInstance();
			to.clear();
			datex = sc.next().split("/");
			if(datex[0].equals("*")) to.set(2037, 12,31);
			else to.set(Integer.parseInt(datex[0]),Integer.parseInt(datex[1]),Integer.parseInt(datex[2]));
			
			if(title.equals("*")) ok.addAll(list);
			else 
				for(int j = 0; j < list.size(); j++) {
					if(list.get(j).title.contains(title)) ok.add(list.get(j));
				}
			if(author.equals("*")) ok2.addAll(ok);
			else
				for(int j = 0; j < ok.size(); j++) {
					if(ok.get(j).author.contains(author)) ok2.add(ok.get(j));
				}
			for(int j = 0; j < ok2.size(); j++) {
				if(ok2.get(j).date.compareTo(from) >= 0 && ok2.get(j).date.compareTo(to) <= 0) System.out.println(ok2.get(j).title);
			}
			
		}
		
	}
	static class Data {
		String title;
		String author;
		Calendar date;
		Data(String a, String b, Calendar c) {
			title = a;
			author = b;
			date = c;
		}
	}
}