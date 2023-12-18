import java.io.*;
  
class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 2; i < x+1; i++){
			String s = String.valueOf(i);
			if(i%3 == 0){
				sb.append(" " + i);
			}else {
				for (int k = 0; k < s.length(); k++){
                    			if (s.indexOf('3') != -1){
                        			sb.append(" " + i);
                        			break;
					}
				}
			}
		}
		System.out.println(sb.toString());
  	}
}