import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			calc(n);
		}
	}
	public void calc(int n){
		String[] name = new String[50];
		for(int i = 0; i < n; i++){
			String line = sc.next();
			
			int before = 1;
			
			for(int j = 0; j < line.length(); j++){
				String s = line.substring(j, j+1);
				if(before == 1){
					if(name[i] == null) name[i] = s;
					else name[i] = name[i] + s;
					before = 0;
				}
				if(s.equals("a") || s.equals("i") || s.equals("u") || 
						s.equals("e") || s.equals("o")){
					before = 1;
				}
			}
		}
		
		int k = 1;
		
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(name[i].equals(name[j])){
					k = -1;
					break;
				}
				while(true){
					String si, sj;
					if(k > name[i].length()) si = name[i];
					else si = name[i].substring(0, k);
					if(k > name[j].length()) sj = name[j];
					else sj = name[j].substring(0, k);
					
					if(si.equals(sj)) k += 1;
					else break;
				}	
			}
			if(k == -1) break;
		}
		
		System.out.println(k);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}