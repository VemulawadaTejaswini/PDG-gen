

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}
	
	HashMap<String, State> map = new HashMap<String, State>();  
	public Main(){
		Scanner sc = new Scanner(System.in);
		createPossiblePattern();
		while(sc.hasNextLine()){
			String puzzle = sc.nextLine();
			puzzle = puzzle.replaceAll(" ", "");
			System.out.println(map.get(puzzle).count);
		}
	}

	
	private void createPossiblePattern(){
		State state = new State(0, 0, "01234567", 0);
		map.put(state.s, state);
		LinkedList<State> queue = new LinkedList<State>(); 
		queue.offer(state);
		
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		while(!queue.isEmpty()){
			State curState = queue.poll();
			
			for(int i=0;i<4;i++){
				int nx = curState.x + dx[i];
				int ny = curState.y + dy[i];
				
				if(0<=nx && nx<4 && 0<=ny && ny<2){
					StringBuilder next = new StringBuilder(curState.s);
					char w = next.charAt(nx+ny*4);
					next.setCharAt(nx+ny*4, next.charAt(curState.x+curState.y*4));
					next.setCharAt(curState.x+curState.y*4, w);
					
					if(!map.containsKey(next.toString())){
						State nextState = new State(nx, ny, next.toString(), curState.count+1);
						map.put(nextState.s, nextState);
						queue.offer(nextState);
					}
				}
			}
		}
	}
	
	private class State{
		public int x;
		public int y;
		public String s;
		public int count;
		
		public State(int x, int y, String s, int count){
			this.x = x;
			this.y = y;
			this.s = s;
			this.count = count;
		}
	}
	
}