import java.io.*;

 public class case1 {
	public static void main (String[] args) throws IOException{

	BufferedReader br = 
	new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();  //??????????????????
		int i = 1;

		while(true){
		int a = Integer.parseInt(br.readLine());
		if( a == 0 ){
		break;
			}

		sb.append("case").append(Integer.toString(i++)).append(":").append(Integer.toString(a)).append("/n");
	 	}
	System.out.println(sb);
	}
}