import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//???????????¢?´¢
//http://itpro.nikkeibp.co.jp/article/COLUMN/20120827/418468/?SS=imgview&FD=-700917643 ??????
public class Main {
	public static void main(String[] args) throws Exception{
		Queue<State> queue = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[][] firstNums = {{0,1,2,3}, {4,5,6,7}};
		State firstState = new State(firstNums, 0, 0, 0);
		map.put(firstState.hashCode(), 0);
		queue.add(firstState);

		while(!queue.isEmpty()){
			State nowState = queue.poll();
			for(State nextState : nowState.nextMove()){
				if(!map.containsKey(nextState.hashCode())){
					map.put(nextState.hashCode(), nextState.getDepth());
					queue.add(nextState);
				}
			}
		}

		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextInt()){
				int[][] finalNums = new int[2][4];
				for(int y = 0; y < 2; y++){
					for(int x = 0; x < 4; x++){
						finalNums[y][x] = sc.nextInt();
					}
				}

				State finalState = new State(finalNums, -1, -1, -1);
				System.out.println(map.get(finalState.hashCode()));
			}
		}
	}

}

class State {

	//???????????????????????????
	private static final int[] vy = new int[]{0, 1, 0, -1};
	private static final int[] vx = new int[]{1, 0, -1, 0};

	private int[][] nums;
	private int zeroX;
	private int zeroY;
	private int hash;
	private int depth; //??¨?????±???

	public State(int[][] nums, int zeroY, int zeroX, int depth){
		this.nums = nums;
		this.zeroY = zeroY;
		this.zeroX = zeroX;
		this.depth = depth;
		this.hash = -1;
	}

	public int getDepth(){
		return depth;
	}

	public LinkedList<State> nextMove(){
		LinkedList<State> list = new LinkedList<>();
		//???????????????4??????
		for(int i = 0; i < 4; i++){
			int nextZeroY = zeroY + vy[i];
			int nextZeroX = zeroX + vx[i];
			if(nextZeroY < 0 || nextZeroY >= 2) continue;
			if(nextZeroX < 0 || nextZeroX >= 4) continue;
			int[][] nextNums = new int[2][4];
			for(int y = 0; y < 2; y++){
				for(int x = 0; x < 4; x++){
					nextNums[y][x] = nums[y][x];
				}
			}
			nextNums[nextZeroY][nextZeroX] = 0;
			nextNums[zeroY][zeroX] = nums[nextZeroY][nextZeroX];
			list.add(new State(nextNums, nextZeroY, nextZeroX, depth + 1));
		}

		return list;
	}

	@Override
	public int hashCode(){
		if(hash != -1) return hash;
		hash = 0;
		for(int y = 0; y < 2; y++){
			for(int x = 0; x < 4; x++){
				hash *= 10;
				hash += nums[y][x];
			}
		}
		return hash;
	}

}