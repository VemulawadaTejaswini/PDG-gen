import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		ArrayList<Integer> rlist = new ArrayList<Integer>();
		ArrayList<Integer> glist = new ArrayList<Integer>();
		ArrayList<Integer> blist = new ArrayList<Integer>();
		
		for(int i=0; i<9; i++){
			rlist.add(0);
			glist.add(0);
			blist.add(0);
		}
		
		//initialize
		for(int i=0; i<t; i++){
			ArrayList<Integer> nums = new ArrayList<Integer>();
			ArrayList<Integer> mark = new ArrayList<Integer>();
			for(int x=0; x<9; x++){
				nums.add(in.nextInt()-1);
			}
			for(int x=0; x<9; x++){
				String tmp = in.next();
				if(tmp.equals("R")) mark.add(0);
				else if(tmp.equals("G")) mark.add(1);
				else if(tmp.equals("B")) mark.add(2);
			}
			
			for(int j=0; j<9; j++){
				rlist.set(j,0);
				glist.set(j,0);
				blist.set(j,0);
			}
			
			//make matrix
			for(int x=0; x<9; x++){
				switch(mark.get(x)){
				case 0:
					rlist.set(nums.get(x),rlist.get(nums.get(x))+1);
					break;
				case 1:
					glist.set(nums.get(x),glist.get(nums.get(x))+1);
					break;
				case 2:
					blist.set(nums.get(x),blist.get(nums.get(x))+1);
					break;
				}
			}
			
			//check
			int sets = 0;
			for(int z=0; z<3; z++){
				for(int x=0; x<7; x++){
					if(rlist.get(x)>0 && rlist.get(x+1)>0 && rlist.get(x+2)>0){
						rlist.set(x, rlist.get(x)-1);
						rlist.set(x+1, rlist.get(x+1)-1);
						rlist.set(x+2, rlist.get(x+2)-1);
						sets++;
					}
					if(glist.get(x)>0 && glist.get(x+1)>0 && glist.get(x+2)>0){
						glist.set(x, glist.get(x)-1);
						glist.set(x+1, glist.get(x+1)-1);
						glist.set(x+2, glist.get(x+2)-1);
						sets++;
					}
					if(blist.get(x)>0 && blist.get(x+1)>0 && blist.get(x+2)>0){
						blist.set(x, blist.get(x)-1);
						blist.set(x+1, blist.get(x+1)-1);
						blist.set(x+2, blist.get(x+2)-1);
						sets++;
					}
				}
			}
			for(int z=0; z<3; z++){
				for(int x=0; x<9; x++){
					if(rlist.get(x)>2){
						rlist.set(x, rlist.get(x)-3);
						sets++;
					}
					if(glist.get(x)>2){
						glist.set(x, glist.get(x)-3);
						sets++;
					}
					if(blist.get(x)>2){
						blist.set(x, blist.get(x)-3);
						sets++;
					}
				}
			}
			
			if(sets == 3) System.out.println(1);
			else System.out.println(0);
		}
	}
}