import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String cmd[] = br.readLine().split(" ", 0);
			int S[] = new int[100];
			for(int i=0, p=0; i<cmd.length; i++){
				if(cmd[i].equals("+")){
					p--;
					S[p-1] += S[p];
				} else if(cmd[i].equals("-")){
					p--;
					S[p-1] -= S[p];
				} else if(cmd[i].equals("*")){
					p--;
					S[p-1] *= S[p];
				} else{
					S[p] = Integer.parseInt(""+cmd[i]);
					p++;
				}
			}
			System.out.println(S[0]);
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}