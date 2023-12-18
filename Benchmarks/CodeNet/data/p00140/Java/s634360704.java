import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	 List<Integer> solve(int start,int arrival){
		final int[] busLine={0,1,2,3,4,5,6,7,8,9,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9};
		int len=busLine.length;
		List<Integer> route=new ArrayList<Integer>();
		boolean riding=false;
		for(int i=0;i<len;++i){
			if(busLine[i]==start){
				route.clear();
				riding=true;
			}
			route.add(busLine[i]);
			if(riding&&busLine[i]==arrival){
				break;
			}
		}
		return route;
	}
	
	void io(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;++i){
			boolean first=true;
			for(int route:solve(s.nextInt(),s.nextInt())){
				if(first){
					first=false;
				}
				else{
					System.out.print(" ");
				}
				System.out.print(route);
			}
			System.out.println();
		}
		s.close();
	}

	public static void main(String[] args) {
		new Main().io();
	}

}