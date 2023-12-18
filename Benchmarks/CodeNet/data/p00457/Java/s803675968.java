import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static class Segment{
		int length, color;

		public Segment(int length, int color) {
			super();
			this.length = length;
			this.color = color;
		}

		@Override
		public String toString() {
			return "Segment [length=" + length + ", color=" + color + "]";
		}
	}
	
	public static int remove(ArrayList<Segment> seg_list, int left, int right){
		int reduce = 0;
		
		while(left >= 0 && right < seg_list.size()){
			if(seg_list.get(left).color != seg_list.get(right).color){
				break;
			}
			
			final int len = seg_list.get(left).length + seg_list.get(right).length;
			if(len < 4){
				break;
			}
			
			left--;
			right++;
			reduce += len;
		}
		
		return reduce;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<Segment> seg_list = new ArrayList<Main.Segment>();
			for(int i = 0; i < n; i++){
				final int color = sc.nextInt();
				
				if(seg_list.isEmpty()){
					seg_list.add(new Segment(1, color));
				}else if(seg_list.get(seg_list.size() - 1).color == color){
					seg_list.get(seg_list.size() - 1).length++;
				}else{
					seg_list.add(new Segment(1, color));
				}
			}
			
			int min = n;
			
			for(int divide = 0; divide < seg_list.size(); divide++){
				if(seg_list.get(divide).length == 1){
					//
					//--xxxo---
					if(divide != 0 && seg_list.get(divide - 1).length >= 3){
						final int len = 1 + seg_list.get(divide - 1).length;
						min = Math.min(min, n - len - remove(seg_list, divide - 2, divide + 1));
					}
					
					//oxxx
					if(divide != seg_list.size() - 1 && seg_list.get(divide + 1).length >= 3){
						final int len = 1 + seg_list.get(divide + 1).length;
						min = Math.min(min, n - len - remove(seg_list, divide - 1, divide + 2));
					}
					
					//xxoxx
					if(divide != 0 && divide != seg_list.size() - 1 &&
							seg_list.get(divide - 1).color == seg_list.get(divide + 1).color){
						final int len = seg_list.get(divide - 1).length + seg_list.get(divide + 1).length + 1;
						
						if(len >= 4){
							min = Math.min(min, n - len - remove(seg_list, divide - 2, divide + 2));
						}
					}
				}else{
					//--xxxo---
					if(divide != 0 && seg_list.get(divide - 1).length >= 3){
						final int len = seg_list.get(divide - 1).length + 1;
						seg_list.get(divide).length--;
						min = Math.min(min, n - len - remove(seg_list, divide - 2, divide));
						seg_list.get(divide).length++;
					}
					
					//oxxx
					if(divide != seg_list.size() - 1 && seg_list.get(divide + 1).length >= 3){
						final int len = 1 + seg_list.get(divide + 1).length;
						seg_list.get(divide).length--;
						min = Math.min(min, n - len - remove(seg_list, divide, divide + 2));
						seg_list.get(divide).length++;
					}
				}
			}
			
			System.out.println(min);
		}
		
	}
}