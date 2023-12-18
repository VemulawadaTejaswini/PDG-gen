import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static ArrayList<Read> read;
	public static HashMap<Integer, Integer> table;
	public static HashMap<Integer, Integer> fsize;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		while(true){
			// 0:write 1:delete 2:read
			int n = in.nextInt();
			if(n==0) break;
			int[][] command = new int[n][3];
			read = new ArrayList<Read>();
			table = new HashMap<Integer, Integer>();
			fsize = new HashMap<Integer, Integer>();
			HashSet<Integer> used = new HashSet<Integer>();
			for(int i=0; i<n; i++){
				char c = in.next().charAt(0);
				if(c=='W'){
					command[i][1] = in.nextInt();
					command[i][2] = in.nextInt();
					fsize.put(command[i][1], command[i][2]);
				}else if(c=='D'){
					command[i][0] = 1;
					command[i][1] = in.nextInt();
				}else{
					command[i][0] = 2;
					command[i][1] = in.nextInt();
					if(used.contains(command[i][1])) continue;
					used.add(command[i][1]);
					read.add(new Read(command[i][1]));
				}
			}
			Collections.sort(read);
			int sum = 0;
			for(int i=0; i<read.size(); i++){
				sum = read.get(i).setSpace(sum);
				table.put(read.get(i).sector, i);
			}
			for(int i=0; i<n; i++){
				switch(command[i][0]){
				case 0:
					write(command[i][1], command[i][2]);
					break;
				case 1:
					delete(command[i][1]);
					break;
				case 2:
					System.out.println(read(command[i][1]));
					break;
				}
			}
			System.out.println();
		}
	}
	
	public static void delete(int file){
		int size = fsize.get(file);
		for(Read r: read){
			size -= r.delete(file);
			if(size == 0) break;
		}
	}
	
	public static int read(int sector){
		return read.get(table.get(sector)).read();
	}
	
	public static void write(int file, int size){
		for(Read r: read){
			size = r.write(file, size);
			if(size == 0) break;
		}
	}
}

class Read implements Comparable<Read>{
	int file = -1;
	HashMap<Integer, Integer> map
		= new HashMap<Integer, Integer>();
	int space;
	int sector;
	public Read(int sector){
		this.sector = sector;
		space = sector;
	}
	
	public int setSpace(int sum){
		space -= sum;
		return sum+space+1;
	}
	
	public int write(int f, int size){
		int res = 0;
		int wr = file == -1 ? 1 : 0;
		if(space == 0 && wr == 0) return size;
		if(size >= space + wr){
			res = size - space-wr;
			size = space;
			if(wr==1) file = f;
		}
		space -= size;
		map.put(f, size);
		return res;
	}
	
	public int delete(int f){
		if(!map.containsKey(f)) return 0;
		int size = map.get(f);
		space += size;
		map.remove(f);
		if(f == file){
			file = -1;
			size++;
		}
		return size;
	}
	
	public int read(){
		return file;
	}
	
	@Override
	public int compareTo(Read o) {
		return sector-o.sector;
	}
}