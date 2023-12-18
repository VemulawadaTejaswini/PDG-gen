import java.io.*;
 
class Main{
    public static void main(String[] args)throws IOException{
		char a = 'a';
		int[] arr = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] ch = br.readLine().toLowerCase().toCharArray();
		for(char alf : ch){
			for(int i=0; i<26; i++){
				if(alf==(a+i)){
					arr[i] += 1;
				}
			}
		}
		for(int i=0; i<26; i++){
			System.out.println((char)(a + i) + " : " + arr[i]);
		}
    }
}