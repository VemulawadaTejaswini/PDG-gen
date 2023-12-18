import java.util.Arrays;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	boolean solve(int[] edges){
		for(int i=2;i<100;++i){
			if(edges[i]%2!=0){
				return false;
			}
		}
		if((edges[0]+edges[1])%2!=0)return false;
		else{
			return true;
		}
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		int[] edges=new int[100];
		sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			Arrays.fill(edges, 0);
			int a,b;
			while(true){
				a=ni();b=ni();
				if(a==0&&b==0)break;
				edges[a-1]++;edges[b-1]++;
			}
			System.out.println(solve(edges)?"OK":"NG");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}