import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static final int A = 1;
	static final int C = 2;
	static final int G = 3;		
	static final int T = 4;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		//?????????
		int n = Integer.parseInt(bf.readLine());
		String[] hash = new String[100000000];
		
		for(int i=0;i<n;i++){
			String[] str =bf.readLine().split(" ");
			String command =str[0];
			String ch = str[1];
			if(command.equals("insert")){
				int count =0;
				for(int j=0;j<ch.length();j++){
					switch(ch.charAt(j)){
					case 'A':
						count+=A*Math.pow(4, j);
						break;
					case 'C':
						count+=C*Math.pow(4, j);
						break;
					case 'T':
						count+=T*Math.pow(4, j);
						break;
					case 'G':
						count+=G*Math.pow(4, j);
						break;
					}
				}
				hash[count]=ch;
			}else{
				int count =0;
				for(int j=0;j<ch.length();j++){
					switch(ch.charAt(j)){
					case 'A':
						count+=A*Math.pow(4, j);
						break;
					case 'C':
						count+=C*Math.pow(4, j);
						break;
					case 'T':
						count+=T*Math.pow(4, j);
						break;
					case 'G':
						count+=G*Math.pow(4, j);
						break;
					}
				}
				
				if(hash[count].equals(ch)){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}

	}

}