import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		doIt();
	}
	
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[]sentence = str.split(" ");
		String maxStr = "";
		int freq = 0;
		int maxFreq = 0;
		String freqStr = "";
		for(int i = 0; i < sentence.length; i++){
			String target = sentence[i];
			if(maxStr.length() < target.length()){
				maxStr = target;
			}
			for(int k = i + 1; k < sentence.length; k++){
				if(target.equals(sentence[k])){
					freq++;
				}
			}
			if(maxFreq < freq){
				freqStr = target;
				maxFreq = freq;
			}
			freq = 0;
		}
		System.out.println(freqStr+" "+maxStr);
	}
	
}