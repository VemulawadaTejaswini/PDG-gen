import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int q = Integer.parseInt(br.readLine());
			String cmd[], wrk;
			int a, b, idx;
			for(int i=0; i<q; i++){
				cmd = br.readLine().split(" ", 0);
				a = Integer.parseInt(cmd[1]);
				b = Integer.parseInt(cmd[2]);
				if(cmd[0].equals("print")){
					System.out.println(str.substring(a, b+1));
				} else if(cmd[0].equals("reverse") || cmd[0].equals("replace")){
					wrk = "";
					if(a!=0) wrk += str.substring(0, a);
					if(cmd[0].equals("reverse")){
						for(idx=b; idx>=a; idx--){
							wrk += str.charAt(idx);
						}
					} else{
						wrk += cmd[3];
					}
					if(b+1!=str.length()) wrk += str.substring(b+1, str.length());
					str = wrk;
				}
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}