import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		HashMap<Integer,Integer> bit = new HashMap<Integer,Integer>();
		HashMap<Integer,String> winner = new HashMap<Integer,String>();
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		int i;
		for(i=0;i<9;i++){
			bit.put(i,(int)Math.pow(2,i));
		}
		winner.put(0,"d");
		winner.put(1,"o");
		winner.put(2,"x");
		while(scan.hasNext()){
			int[] result = {0,0};
			app.input(bit,result,scan);
			System.out.println(winner.get(app.judge(result)));
		}
		
	}
	
	public int judge(int[] result){
		int[] win = {7,56,448,73,146,292,273,84};
		
		for(int i=0;i<8;i++){
			if(result[0] == win[i]){
				return 1;
			}else if(result[1] == win[i]){
				return 2;
			}
		}
		
		return 0;
	}
	
	public void input(HashMap<Integer,Integer> bit,int[] result,Scanner scan){
		String str = scan.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'o'){
				result[0] += bit.get(i);
			}else if(str.charAt(i) == 'x'){
				result[1] += bit.get(i);
			}
		}
	}
}