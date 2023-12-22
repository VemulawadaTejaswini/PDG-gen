import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String[] array = br.readLine().split(" ");
	        int x = Integer.parseInt(array[0]);
	        int y = Integer.parseInt(array[1]);
	        if(x==0&&y==0){
	        	break;
	        }else if(x>y){
	        	sb.append(y+" "+x+"\n");
	        }else{
	        	sb.append(x+" "+y+"\n");
	        }
		}
		System.out.print(sb.toString());
	}
}