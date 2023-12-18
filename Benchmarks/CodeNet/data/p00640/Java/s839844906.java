import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Page{
		String page_name;
		int page_number;
		int[][] btns;
		int[] links;
		
		public Page(String page_name, int page_number, int[][] btns, int[] links) {
			super();
			this.page_name = page_name;
			this.page_number = page_number;
			this.btns = btns;
			this.links = links;
		}
		
		public int touch(int x, int y){
			for(int i = 0; i < btns.length; i++){
				final int lu_x = btns[i][0];
				final int lu_y = btns[i][1];
				final int rd_x = btns[i][2];
				final int rd_y = btns[i][3];
				
				if(lu_x <= x && x <= rd_x && lu_y <= y && y <= rd_y){
					return links[i]; 
				}
			}
			
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			String[] name = new String[n];
			int[] btns = new int[n];
			int[][][] rects = new int[n][][];
			String[][] links = new String[n][];
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for(int i = 0; i < n; i++){
				name[i] = sc.next();
				final int k = sc.nextInt();
				btns[i] = k;
				
				rects[i] = new int[k][4];
				links[i] = new String[k];
				for(int j = 0; j < k; j++){
					rects[i][j][0] = sc.nextInt();
					rects[i][j][1] = sc.nextInt();
					rects[i][j][2] = sc.nextInt();
					rects[i][j][3] = sc.nextInt();
					links[i][j] = sc.next();
				}
				
				map.put(name[i], i);
			}
			
			Page[] pages = new Page[n];
			for(int i = 0; i < n; i++){
				int[] link = new int[btns[i]];
				for(int j = 0; j < btns[i]; j++){
					link[j] = map.get(links[i][j]);
				}
				
				pages[i] = new Page(name[i], i, rects[i], link);
			}
			
			ArrayList<Integer> history = new ArrayList<Integer>();
			history.add(0);
			int size = 1;
			int cur_pos = 0;
			
			int cur_page = 0;
			final int q = sc.nextInt();
			for(int t = 0; t < q; t++){
				String input = sc.next();
				
				if("forward".equals(input)){
					if(cur_pos < size - 1){
						cur_pos++;
						cur_page = history.get(cur_pos);
					}
				}else if("back".equals(input)){
					if(cur_pos > 0){
						cur_pos--;
						cur_page = history.get(cur_pos);
					}
				}else if("click".equals(input)){
					final int x = sc.nextInt();
					final int y = sc.nextInt();
					
					int ret = pages[cur_page].touch(x, y);
					
					if(ret >= 0){
						cur_pos++;
						cur_page = ret;
						history.add(cur_page, cur_pos);
						size = cur_pos + 1;
						
						
					}
				}else if("show".equals(input)){
					System.out.println(pages[cur_page].page_name);
				}
			}
			
		}
	}

}