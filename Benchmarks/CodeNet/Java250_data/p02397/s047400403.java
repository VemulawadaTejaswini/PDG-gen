import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
	int x =0;
	int y =0;
	int t =0;
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> listx = new ArrayList<Integer>();
	ArrayList<Integer> listy = new ArrayList<Integer>();
		while(scan.hasNextLine()){
			x = scan.nextInt();			
			y = scan.nextInt();
			
			if(x==0 && y==0){
				break;
			}
			else{
				if(x>y){
					t=x;
					x=y;
					y=t;
				}
				listx.add(x);			
				listy.add(y);
			}
		}
		for(int i=0;i<listx.size();i++){
			System.out.println(listx.get(i)+" "+listy.get(i));
		}
	}
}