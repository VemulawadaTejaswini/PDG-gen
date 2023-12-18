import java.io.*;
public class Main {
	public static void main(String[] args)throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;){
			String text = br.readLine();
			if(text.equals(".")) break;
			String word[] = text.split("");
			int i;
			int j = 0;
			int[] t = new int[100];
			for(i = 0; i < text.length(); i++){
				if(word[i].equals("(")){
					t[j] = 1;
					j++;
				}
				else if(word[i].equals("[")){
					t[j] = 2;
					j++;
				}
				else if(word[i].equals(")")){
					if(j > 0 && t[j - 1] == 1){
						t[j - 1] = 0;
						j--;
						}
				}
				else if(word[i].equals("]")){
					if(j > 0 && t[j - 1] == 2){
						t[j - 1] = 0;
						j--;
					}
				}
			}
			int p = 0;
			for(i = 0; i < t.length; i++){
				if(t[i] == 0) p++;
				else continue;
			}
			if(p == t.length) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
			