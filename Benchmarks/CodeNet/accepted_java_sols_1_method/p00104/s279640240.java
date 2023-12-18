
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<Integer> res=new LinkedList<Integer>();

		while(true) {
			String line=br.readLine();
			String[] charArray=line.split(" ");
			int h=Integer.parseInt(charArray[0]), w=Integer.parseInt(charArray[1]);
			if(h==0&&w==0) break;
			char[][] tile=new char[h][];
			for(int i=0; i<h; i++) {
				tile[i]=br.readLine().toCharArray();
			}

			boolean[][] record=new boolean[h][];
			for(int i=0; i<record.length; i++) {
				record[i]=new boolean[w];
				Arrays.fill(record[i], false);
			}

			int px=0, py=0;
			while(true) {
				if(record[py][px]) {
//					System.out.println("LOOP");
					res.add(-1);
					break;
				}
				record[py][px]=true;
				switch(tile[py][px]) {
				case '<':
					px--;
					break;
				case '>':
					px++;
					break;
				case '^':
					py--;
					break;
				case 'v':
					py++;
					break;
				}
				if(tile[py][px]=='.') {
					res.add(px*200+py);
					break;
				}
			}
		}

		for(int val: res)
			if(val==-1)
				System.out.println("LOOP");
			else
				System.out.println(val/200+" "+val%200);

		br.close();
	}
}