import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			int N=cin.nextInt();
			if(N==0)break;
			Team[] t=new Team[N];
			int team=0;
			Map<Integer, Integer>map=new HashMap<Integer,Integer>();
			for(int i=0;i<N;i++){
				int a=cin.nextInt();
				int b=cin.nextInt();
				int c=cin.nextInt();
				int d=cin.nextInt();
				t[i]=new Team(a,b,c,d);
				if(!map.containsKey(b)){
					map.put(b, 0);
				}
			}
			Arrays.sort(t);
			for(int i=0;i<N;i++){
				System.out.println(t[i].id);
			}
			
			
			for(int i=0;i<N;i++){
				int belong=t[i].belong;
				if(team<10){
					if(map.get(belong)<3){
						t[i].okay=true;
						map.put(belong, map.get(belong)+1);
						team++;
					}
				}
				else if(team<20){
					if(map.get(belong)<2){
						t[i].okay=true;
						map.put(belong, map.get(belong)+1);
						team++;
					}
				}
				else if(team<26){
					if(map.get(belong)<1){
						t[i].okay=true;
						map.put(belong, map.get(belong)+1);
						team++;
					}
				}
			}
		}
	}
	static class Team implements Comparable<Team>{
		int id, belong, solve, pena;
		boolean okay;
		Team(int a,int b,int c,int d){
			id=a;
			belong=b;
			solve=c;
			pena=d;
			okay=false;
		}
		public int compareTo(Team t){
			if(solve==t.solve){
				if(pena==t.pena){
					return id-t.id;
				}
				return pena-t.pena;
			}
			return t.solve-solve;
		}
	}
}