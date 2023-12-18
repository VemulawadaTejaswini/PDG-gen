
import java.io.*;
import java.util.*;

public class Main {
	
	static class Lake {
		public final int top;
		public final int area;
	
		public Lake(int top, int area) {
			this.top  = top;
			this.area = area;
		}
	}

	public static void main(String...args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> downPoints = new Stack<>();
		Stack<Lake> lakes = new Stack<>();
		int totalArea = 0;
		char[] diag = br.readLine().toCharArray();
		
		for(int i = 0; i < diag.length; i++) {
			if(diag[i] == '\\') {
				downPoints.push(i);
			} else if(diag[i] == '/' && downPoints.size() > 0) {
				int downPoint = downPoints.pop();
				int nowArea = i - downPoint;
				totalArea += nowArea;
				while(lakes.size() > 0 && lakes.peek().top > downPoint) {
					nowArea += lakes.pop().area;
				}
				lakes.push(new Lake(downPoint, nowArea));
			}
		}
		System.out.println(totalArea);
		System.out.print(lakes.size());
		Stack<Integer> reverseLakes = new Stack<>();
		while(lakes.size() > 0) {
		    reverseLakes.push(lakes.pop().area);
		}
		while(reverseLakes.size() > 0) {
			System.out.print(" " + reverseLakes.pop());
		}
		System.out.println();
	}
}

