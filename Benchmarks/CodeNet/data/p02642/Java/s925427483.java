import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{

	public static final int SIZE = 1000001;

	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(a);
			
		ArrayList<Pair> ans = new ArrayList<Pair>();
		boolean [] isPrime = new boolean[SIZE];
		for(int i=0;i<n;i++){
			boolean check = true;
			int sqrtn = (int)Math.sqrt(a[i]);		
			for(int j=1;j<=sqrtn && check;j++){
				if(a[i] % j == 0){
					if(isPrime[j]) check = false;
					if(isPrime[a[i] / j]){
						check = false;
						if(!ans.isEmpty() && ans.get(ans.size() - 1).getLeft() == a[i]){
							ans.get(ans.size() - 1).setRight(false); 
						}
					}
				}
			}
			if(check){
				ans.add(new Pair(a[i], true));
			}
			isPrime[a[i]] = true;
		}

		int val = 0;
		for(int i=0;i<ans.size();i++){
			if(ans.get(i).getRight()) val++;
		}
		bw.write(val+"");
		bw.flush();
		bw.close();
		br.close();
	}
}

class Pair{
	int left;
	boolean right;

	public Pair(int left, boolean right){
		this.left = left;
		this.right = right;
	}

	public void setRight(boolean right){
		this.right = right;
	}

	public int getLeft(){
		return this.left;
	}
	
	public boolean getRight(){
		return this.right;
	}
}