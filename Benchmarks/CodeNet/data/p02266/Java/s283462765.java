import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String[] commands = br.readLine().split("");
		
		Deque<Integer> slopes = new ArrayDeque<>();
		Deque<Area> localAreas = new ArrayDeque<>();
		int totalArea = 0;
		
		for(int i = 0; i < commands.length; i++){
			if(commands[i].equals("\\")){
				slopes.push(i);
			}else if(commands[i].equals("/")){
				if(!slopes.isEmpty()){
					int org = slopes.pop();
					int addArea = i - org;
					totalArea += addArea;
					
					int localArea = 0;
					while(!localAreas.isEmpty()){
						Area a = localAreas.peek();
						if(org < a.x){
							localArea += a.area;
							localAreas.pop();
						}else{
							break;
						}
					}
					localAreas.push(new Area(org, localArea + addArea));
				}
			}
		}
		
		System.out.println(totalArea);
		
		StringJoiner sj = new StringJoiner(" ");
		sj.add(String.valueOf(localAreas.size()));
		
		while(!localAreas.isEmpty()){
			sj.add(String.valueOf(localAreas.pollLast().area));
		}
		System.out.println(sj);
	}
	
	static class Area{
		int x = 0;
		int area = 0;
		public Area(int x, int area) {
			this.x = x;
			this.area = area;
		}
	}
}

