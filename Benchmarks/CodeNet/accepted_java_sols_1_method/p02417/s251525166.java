import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] sum = new int[26];
		String sentence;

		while((sentence=br.readLine())!=null){
			for(int i=0; i<sentence.length(); i++){
				char c = sentence.charAt(i);
				c = Character.toLowerCase(c);
				char cc ='a';
				for(int j=0; j<sum.length; j++){
					if(cc==c) sum[j]++;
					cc++;
				}
			}
		}
		char cc = 'a';
		for(int i=0; i<sum.length; i++){
			System.out.println(cc + " : " + sum[i]);
			cc++;
		}
	}
}