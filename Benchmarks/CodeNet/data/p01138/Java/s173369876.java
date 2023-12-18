import java.util.*;
public class Main {
	int[] use;
	int[][][] go,back;
	int hh,mm,ss,n,count;
	String str1,str2;
	String[] t1,t2;
	Scanner stdin=new Scanner (System.in);
	
	
	void Solve(){
		while(true){
			n=stdin.nextInt();
			if(n==0) break;
			
			use=new int[3600*24];
			go=new int[24][60][60];
			back=new int[24][60][60];
			
			for(int i=0;i<n;i++){
				str1=stdin.next();
				t1=str1.split(":");
				str2=stdin.next();
				t2=str2.split(":");
				
	
				go[Integer.parseInt(t1[0])][Integer.parseInt(t1[1])][Integer.parseInt(t1[2])]++;
				back[Integer.parseInt(t2[0])][Integer.parseInt(t2[1])][Integer.parseInt(t2[2])]++;				
				
			}
			
			for(int i=0;i<24;i++){
				for(int j=0;j<60;j++){
					for(int k=0;k<60;k++){
						int r=3600*i+60*j+k;
						if(r==0) use[r]=go[i][j][k];
						else use[r]=use[r-1]+go[i][j][k]-back[i][j][k];
						
					}
				}
			}
			
			Arrays.sort(use);
			System.out.println(use[use.length-1]);
			
		}
		
		
		
		
		
	}
	public static void main(String args[]){
		
		Main m=new Main();
		m.Solve();
	}
	
	
	
}