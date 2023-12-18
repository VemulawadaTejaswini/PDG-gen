import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Dice{
	int top;
	int bottom;
	int S;
	int W;
	int E;
	int N;

	Dice(int a,int b, int c,int d,int e,int f){
		this.top = a;
		this.bottom = b;
		this.S = c;
		this.W = d;
		this.E = e;
		this.N = f;
	}

	public void RollS(){
		int tmp = this.bottom;
		this.bottom = this.S;
		this.S = this.top;
		this.top = this.N;
		this.N = tmp;
}

	public void RollW(){
		int tmp =this.top;
		this.top = this.E;
		this.E = this.bottom;
		this.bottom = this.W;
		this.W = tmp;
	}

	public void RollE(){
		int tmp = this.top;
		this.top = this.W;
		this.W = this.bottom;
		this.bottom = this.E;
		this.E = tmp;
	}

	public void RollN(){
		int tmp = this.top;
		this.top = this.S;
		this.S = this.bottom;
		this.bottom = this.N;
		this.N = tmp;
	}

	public int showF(int a,int b){
		if(a == this.top){
		}else if(a == this.bottom){
			RollS();
			RollS();
		}else if(a == this.S){
			RollN();
		}else if(a == this.E){
			RollW();
		}else if(a == this.W){
			RollE();
		}else if(a == this.N){
			RollS();
		}

		if(b == this.S){
			return this.E;
		}else if(b == this.W){
			return this.S;
		}else if( b == this.N){
			return this.W;
		}else{
			return this.N;
		}
	}
}

public class Main　{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
		String[] nums = str.split("\\s");
		int[] temp = new int[6];

		for(int i=0;i<6;i++){
			temp[i] = Integer.parseInt(nums[i]);
		}

		Dice D = new Dice(temp[0],temp[5],temp[1],temp[3],temp[2],temp[4]);
		str = br.readLine();
		int count = Integer.parseInt(str);
		for(int i = 0;i < count; i++){
			str = br.readLine();
			String[] te = str.split("\\s");
			int ans = D.showF(Integer.parseInt(te[0]),Integer.parseInt(te[1]));
			System.out.println(ans);
		}
	}
}

