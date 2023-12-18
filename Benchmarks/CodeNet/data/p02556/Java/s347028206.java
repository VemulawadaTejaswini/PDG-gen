import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] xs = new int[n];
			int[] ys = new int[n];
			
			List<Node> nodes = new ArrayList<>();
			
			long sumX = 0;
			long sumY = 0;
			for(int i = 0 ; i < n ; i++ ) {
				xs[i] = sc.nextInt();
				ys[i] = sc.nextInt();
				
				Node node = new Node();
				node.x = xs[i];
				node.y = ys[i];
				nodes.add(node);
				
				sumX += xs[i];
				sumY += ys[i];
			}
			
			//calc average
			int aX = (int)(sumX / n);
			int aY = (int)(sumY / n);

			nodes.stream().forEach(node -> node.calcFromAverage(aX, aY));
			//divide nodes by area and get max
			Node area1Max = nodes.stream().filter(node -> node.area == 1).max((n1,n2) -> (n1.mdist - n2.mdist)).orElse(null);
			Node area2Max = nodes.stream().filter(node -> node.area == 2).max((n1,n2) -> (n1.mdist - n2.mdist)).orElse(null);
			Node area3Max = nodes.stream().filter(node -> node.area == 3).max((n1,n2) -> (n1.mdist - n2.mdist)).orElse(null);
			Node area4Max = nodes.stream().filter(node -> node.area == 4).max((n1,n2) -> (n1.mdist - n2.mdist)).orElse(null);
			
			
			int mdist1 = (area1Max == null ? 0 : area1Max.mdist) + (area3Max == null ? 0 : area3Max.mdist);
			int mdist2 = (area2Max == null ? 0 : area2Max.mdist) + (area2Max == null ? 0 : area4Max.mdist);
			
			if ( mdist1 > mdist2 ) {
				System.out.println(mdist1);
			}
			else {
				System.out.println(mdist2);
			}
			
		}
	}
	
	private static class Node {
		
		public int x;
		public int y;
		
		public int dx;
		public int dy;
		
		public long dist2;
		public int mdist;
		
		public int area;
	
		public void calcFromAverage(int ax, int ay) {
			dx = x - ax;
			dy = y - ay;
			
			dist2 = dx * dx + dy * dy;
			mdist = Math.abs(dx) + Math.abs(dy);
			
			if ( dx >= 0 ) {
				if ( dy >= 0 ) {
					area = 1;
				}
				else {
					area = 4;
				}
			}
			else {
				if ( dy >= 0 ) {
					
					area = 2;
				}
				else {
					area = 3;
				}
			}
		}
	}

}