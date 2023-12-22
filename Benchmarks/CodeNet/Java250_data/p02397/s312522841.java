import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true){
			String s=br.readLine();
			if(s.equals("0 0")) break;
	        int x=Integer.parseInt(s.substring(0, s.indexOf(" ")));
	        int y=Integer.parseInt(s.substring(s.indexOf(" ")+1));
	        if(x>y){
	        	sb.append(y+" "+x+"\n");
	        }else{
	        	sb.append(x+" "+y+"\n");
	        }
		}
		System.out.print(sb);
	}
}