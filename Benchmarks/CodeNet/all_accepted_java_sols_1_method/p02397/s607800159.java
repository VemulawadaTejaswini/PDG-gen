import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String[] a=br.readLine().split(" ");
			if(a[0].equals("0")&&a[1].equals("0")) break;
	        int x=Integer.parseInt(a[0]);
	        int y=Integer.parseInt(a[1]);
	        if(x>y){
	        	sb.append(y+" "+x+"\n");
	        }else{
	        	sb.append(x+" "+y+"\n");
	        }
		}
		System.out.print(sb);
	}
}