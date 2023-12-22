import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.next();
			String t = sc.next();
			if(s.compareTo("0")==0 && t.compareTo("0")==0)break;
			
			int hit = 0;
			int blow = 0;
			int temp = 0;
			int[] n = new int[4];
			for(int i=0;i<4;i++){
				n[i] = Integer.valueOf(s.substring(i,i+1));
			}
			for(int i=0;i<4;i++){
				temp = Integer.valueOf(t.substring(i,i+1));
				for(int j=0;j<4;j++){
					if(temp==n[j]){
						if(i==j)hit++;
						else blow++;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}
	
	}	
}