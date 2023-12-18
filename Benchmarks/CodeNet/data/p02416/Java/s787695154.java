import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb=new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
		while(true){
		  s=br.readLine();
		  if(s.equals("0")) break;
		  sb.append(sum(s)+"\n");
		}
		System.out.println(sb);
	}
	
	private static int sum(String s){
		int r=0;
		if(s.length()==1){
		  r=Integer.parseInt(s);
		}else{
		  r=Integer.parseInt(s.substring(0,1))+sum(s.substring(1));
		}
		return r;
	}
}