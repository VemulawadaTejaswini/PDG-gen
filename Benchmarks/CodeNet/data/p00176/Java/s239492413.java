import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static int[][] base = {
		{0, 0, 0}, {0, 0, 255}, {0, 255, 0}, {0, 255, 255},
		{255, 0, 0}, {255, 0, 255}, {255, 255, 0}, {255, 255, 255}
	};
	
	public static String[] base_name = {
		"black", "blue", "lime", "aqua", "red", "fuchsia", "yellow", "white"
	};
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			if(line.equals("0")) break;
			
			int[] color = new int[3];
			color[0] = hex2num(line.substring(1, 3));
			color[1] = hex2num(line.substring(3, 5));
			color[2] = hex2num(line.substring(5, 7));
			String name = "";
			int min = Integer.MAX_VALUE;
			for(int i=0; i<base.length; i++){
				int val = delta(base[i], color);
				if(val < min){
					min = val;
					name = base_name[i];
				}
			}
			
			System.out.println(name);
		}
	}
	
	public int delta(int[] a, int[] b){
		int ans = 0;
		for(int i=0; i<3; i++){
			int d = a[i] - b[i];
			ans += d * d;
		}
		return ans;
	}
	
	public int hex2num(String h){
		String[] rigid = new String[]{
				"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"
		};
		
		int num = 0;
		String a = h.substring(0, 1);
		String b = h.substring(1, 2);
		for(int i=0; i<rigid.length; i++){
			if(a.equals(rigid[i])){
				num += i * 16;
			}
			
			if(b.equals(rigid[i])){
				num += i;
			}
		}
		
		return num;
	}
}