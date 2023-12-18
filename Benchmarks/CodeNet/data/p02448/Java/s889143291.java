import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		Items[] a = new Items[n];
		for(int i = 0; i < n; i++) a[i] = new Items();
		for(int i = 0; i < n; i++){
			str = br.readLine().split(" ");
			a[i].value = Integer.parseInt(str[0]);
			a[i].weight = Integer.parseInt(str[1]);
			a[i].type = str[2].charAt(0);
			a[i].date = Long.parseLong(str[3]);
			a[i].name = str[4];
		}
		Arrays.sort(a);
		for(int i = 0; i < n; i++) System.out.println(a[i].value + " " + a[i].weight + " " + a[i].type + " " + a[i].date + " " + a[i].name);
	}
}

class Items implements Comparable<Items>{
	int value;
	int weight;
	char type;
	long date;
	String name;
	@Override
	public int compareTo(Items b){
		if(this.value != b.value) return this.value - b.value;
		if(this.weight != b.weight) return this.weight - b.weight;
		if(this.type != b.type) return Character.compare(this.type, b.type);
		if(this.date != b.date) return (this.date - b.date < 0 ? -1 : 1);
		return this.name.compareTo(b.name);
	}
}

