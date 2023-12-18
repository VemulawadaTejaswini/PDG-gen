import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while((line=r.readLine())!=null){
				/* input from here */
				int n = Integer.parseInt(line);
				String[] in = r.readLine().split(" ");
				boolean[][] b = new boolean[7][7];
				boolean res = false;
				for(int i=0;i<7;i++){
					Arrays.fill(b[i], false);
				}
				for(String s : in){
					b[Math.min(Integer.parseInt(s.substring(0,1)),Integer.parseInt(s.substring(1)))][Math.max(Integer.parseInt(s.substring(0,1)),Integer.parseInt(s.substring(1)))] = true;
				}
				int count = in.length;
				/* input till here */

				boolean[][] temp = new boolean[7][7];        					
				for(int i=0;i<7;i++){
					for(int j=i;j<7;j++){
						temp[i][j] = b[i][j];
					}
				}
				/* processing from here */
				for(int i=0;i<7;i++){
					for(int j=i;j<7;j++){
						if(b[i][j]){
							temp[i][j] = false;
							if(res = solve(temp,i,j,count,i)){
								break;
							} else if(res = solve(temp,i,j,count,j)){
								break;
							}
							temp[i][j] = true;
						}
					}
					if(res){
						break;
					}
				}
				/* processing till here */
				/* output */
				if(res){
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean solve(boolean[][] b, int sr,int sc, int count,int open){
		boolean res = false;
		//System.out.println("current: " + sr + " " + sc + " count:" + count + " open: " + open);
		if(count==1){
			//System.out.println(s);
			return true;
		} else {			
			for(int column=0;column<7;column++){
				if(column==sc){
					continue;
				}
				if(b[open][column]){
					b[open][column] = false;
					res = solve(b,open,column,count-1,column);
					b[open][column] = true;
				}
				if(res){
					break;
				}
			}
			for(int row=0;row<=6;row++){
				if(row==sr){
					continue;
				}
				if(res){
					break;
				}
				if(b[row][open]){
					b[row][open] = false;
					res = solve(b,row,open,count-1,row);
					b[row][open] = true;
				}
			}
			//System.out.println("FAIL");
			if(res){
				return true;
			} else {
				return false;
			}
		}
	}
}