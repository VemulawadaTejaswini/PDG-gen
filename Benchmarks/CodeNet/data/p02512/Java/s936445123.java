import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		List<Sima> list = new ArrayList<Sima>(25);
		while(true) {
			size = Integer.parseInt(br.readLine());
			if(size == 0) break;
			
			list.clear();
			
			for(int i = 0; i < size; i++) {
				String str = br.readLine();
				int sPos = str.indexOf(" ");
				list.add(new Sima(Integer.parseInt(str.substring(0, sPos)), Integer.parseInt(str.substring(sPos+1))));
			}
			Collections.sort(list);
			
			int takaraSum = 0;
			boolean ok = true;
			for(int i = 0; i < size; i++) {
				Sima sima = list.get(i);
				takaraSum += sima.takara;
				if(takaraSum > sima.capacity) {
					ok = false; break;
				}
			}
			System.out.println(ok ? "Yes" : "No");
		}
	}

	static class Sima implements Comparable<Sima> {
		public int takara;
		public int capacity;
		
		public Sima(int takara, int capacity) {
			this.takara = takara;
			this.capacity = capacity;
		}
		public int compareTo(Sima anotherSima) {
			return capacity - anotherSima.capacity;
		}
	}
}