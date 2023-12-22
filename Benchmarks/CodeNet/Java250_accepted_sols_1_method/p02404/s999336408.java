import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
	int h =0;
	int w =0;
	int t =0;
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> listw = new ArrayList<Integer>();
	ArrayList<Integer> listh = new ArrayList<Integer>();
		while(scan.hasNextLine()){
			h = scan.nextInt();			
			w = scan.nextInt();
			
			if(h==0 && w==0){
				break;
			}
			else{
				listh.add(h);
				listw.add(w);
			}
		}
		
		
		
		for(int i=0;i<listh.size();i++){
			for(int ii=0;ii<listh.get(i);ii++){
				for(int iii=0;iii<listw.get(i);iii++){
					if(ii == 0 || ii ==listh.get(i)-1 || iii == 0 || iii == listw.get(i)-1){
					System.out.print("#");
					}
					else{
					System.out.print(".");
					}
					
				}
			System.out.println("");
			}
		System.out.println("");
		}
	}
}