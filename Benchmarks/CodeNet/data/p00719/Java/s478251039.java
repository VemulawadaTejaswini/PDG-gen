package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	int[][] map;
	boolean[] hasVisited;
	ArrayList<Integer> keiro;
	int goal;
	double minDist;
	int[] tosu;
	void start(){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			int m = in.nextInt();	//????????°
			int p = in.nextInt();	//????????????????????¬??°
			int a = in.nextInt();	//????????????
			goal = in.nextInt();	//????????????
			minDist = Double.MAX_VALUE;
			tosu = new int[n];
			hasVisited = new boolean[m];
			for(int i = 0; i < n; i++){
				tosu[i] = in.nextInt();
			}
			Arrays.sort(tosu);
			map =  new int[m][m];
			for(int i = 0; i < p; i++){
				int from = in.nextInt();
				int to = in.nextInt();
				int len = in.nextInt();
				map[from-1][to-1] = len;
				map[to-1][from-1] = len;
			}
			keiro = new ArrayList<Integer>();
			bfs(a-1,tosu.length);
			if(minDist == Double.MAX_VALUE) System.out.println("Impossible");
			else System.out.println(minDist);
//			Stack<Integer> stack = new Stack<Integer>();
//			stack.push(a);
//			int count = tosu.length;
//			while(!stack.isEmpty()){
//				int node = stack.pop();
//				keiro.add(node);
//				if(node == b){
//					getDistance(keiro, tosu);
//				}
//				count--;
//				if(count == 0)continue;
//			}
//			double[] distance = new double[m];
//			if (distance[b]==Integer.MAX_VALUE) {	// ?§£??????
//			    System.out.println("Impossible");
//			} else {
//			    System.out.println(distance[b]);
//			}
		}
		in.close();
	}
	void bfs(int node, int count){
		if(node != goal -1 && count == 0){
			return;
		}
		hasVisited[node] = true;
		keiro.add(node);
//		print(count);
		if(node == goal-1){
			int[] kyori = getKyori(keiro.toArray(new Integer[0]));
			Arrays.sort(kyori);
			double dist = getDistance(kyori,tosu);
			if(minDist > dist) minDist = dist;
			keiro.remove(keiro.size()-1);
			hasVisited[node] = false;
			return;
		}
		count--;
		for(int i = 0; i < map[node].length; i++){
			if(map[node][i] != 0 && !hasVisited[i]){
				bfs(i,count);
				if(i == goal - 1) break;
			}
		}
		keiro.remove(keiro.size()-1);
		hasVisited[node] = false;
	}
	void print(int count){
		for(Integer i : keiro){
			System.out.print(i+"=>");
		}
		System.out.println(count);
	}
	int[] getKyori(Integer[] keiro){
		int[] kyori = new int[keiro.length-1];
		for(int i = 0; i < kyori.length; i++){
			kyori[i] = map[keiro[i]][keiro[i+1]];
		}
		return kyori;
	}
	double getDistance(int[] kyori, int[]tosu){
		double dist = 0;
		for(int i = 0; i < kyori.length; i++){
			dist += kyori[kyori.length-1-i]/(double)tosu[tosu.length-1-i];
		}
		return dist;
	}

//	void dijkstra(int[][] map, int src, double[] distance){
//		int nTown = distance.length;
//		boolean[] fixed = new boolean[nTown];
//		for(int i = 0; i < nTown; i++){
//			distance[i] = Integer.MAX_VALUE;
//			fixed[i] = false;
//		}
//		distance[src] = 0;
//		while(true){
//			int marked = minIndex(distance, fixed);
//			if (marked < 0) break;
//			if(distance[marked] == Integer.MAX_VALUE) break;
//			fixed[marked] =true;
//			for(int j =0; j < nTown; j++){
//				if(map[marked][j] > 0 && !fixed[j]){
//					double newDistance = distance[marked] + map[marked][j];
//					if(newDistance < distance[j])distance[j] = newDistance;
//				}
//			}
//		}
//	}
//	int minIndex(double[] distance, boolean[] fixed){
//		int idx = 0;
//		for(; idx < fixed.length; idx++){
//			if(!fixed[idx])break;
//		}
//		if(idx == fixed.length) return -1;
//		for(int i = idx + 1; i < fixed.length; i++){
//			if(!fixed[i] && distance[i] < distance[idx])idx = i;
//		}
//		return idx;
//	}

}