import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int t=1;t<=n;t++){	//n cases
			int outcnt=0,score=0,runner=0;
			while(in.hasNext()){
				//System.out.println(outcnt+" "+score+" "+runner);
				String s=in.next();
				if(s.charAt(1)=='I'){	//HIT
					runner++;
					if(runner>3){
						score++;
						runner--;
					}
				}
				else if(s.charAt(1)=='U'){	//OUT
					outcnt++;
					if(outcnt==3){
						System.out.println(score);
						break;
					}
				}
				else{	//HOMERUN
					score+=(runner+1);
					runner=0;
				}
			}
		}
		in.close();
	}
}