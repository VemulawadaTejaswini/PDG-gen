import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
	int x =0;
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	int ii = 0;
		while(scan.hasNextInt()){
			x = scan.nextInt();			
			if(x == 0){
				break;
			}
			else{
				list.add(x);
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.println("Case "+(i+1)+": "+list.get(i));
		}
	}
}