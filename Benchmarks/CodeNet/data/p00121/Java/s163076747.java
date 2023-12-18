import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			LinkedList<Puzzle> oList = new LinkedList<Puzzle>();
			LinkedList<Puzzle> cList = new LinkedList<Puzzle>();
			int[] tmp = new int[8];
			for(int i=0; i<8; i++)		tmp[i] = in.nextInt();
			oList.addFirst(new Puzzle(tmp, 0));
			int n = -1;
			while(!oList.isEmpty()){
				if((n=routine(oList, cList))!=-1)	break;
			}
			System.out.println(n);
		}
	}
	
	private static int routine(LinkedList<Puzzle> oList, LinkedList<Puzzle> cList){
		Puzzle p = oList.getFirst();
		if(p.isGoal()){
			return p.g;
		}else{
			for(Puzzle pp : cList)	if(Arrays.equals(p.panel, pp.panel)){oList.remove(p); return -1;}
			int i0 = -1;	// 0の位置
			for(int i=0; i<8; i++)	if(p.panel[i]==0){i0 = i; break;}
			addNextPuzzle(i0,i0-1,p,oList);
			addNextPuzzle(i0,i0+1,p,oList);
			addNextPuzzle(i0,i0-4,p,oList);
			addNextPuzzle(i0,i0+4,p,oList);
			cList.addLast(p);
			oList.remove(p);
			return -1;
		}
	}
	
	private static void addNextPuzzle(int i, int j, Puzzle p, LinkedList<Puzzle> oList){
		if(0 <= j && j < 8 && !(i==3&&j==4) && !(i==4&&j==3)){
			int[] tmp = Arrays.copyOf(p.panel, 8);
			tmp[i] = tmp[j];
			tmp[j] = 0;
			Puzzle newP = new Puzzle(tmp, p.g+1);
			for(int k=0; k<oList.size(); k++){
				if(newP.f <= oList.get(k).f){
					oList.add(k, newP);
					return;
				}
			}
			oList.addLast(newP);
		}
		return;
	}
}

class Puzzle {
	int[] panel;
	int g, f;
	public Puzzle(int[] panel, int g) {
		this.panel = panel;
		this.g = g;
		calcH();
	}
	public boolean isGoal(){
		int[] goal = new int[]{0,1,2,3,4,5,6,7};
		if(Arrays.equals(panel, goal))	return true;
		else							return false;
	}
	public void calcH(){
		int h=0;
		for(int i=0; i<8; i++){
			if(panel[i]!=0){
				h += Math.abs(panel[i]-i)/4 + Math.abs(panel[i]-i)%4;
			}
		}
		f = g+h;
		return;
	}
}