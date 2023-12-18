import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String[] sentence = new String[32];
		String token;
		int[] num = new int[32];
		int current = 1,max = 0,maxLen=0;
		int i;
		boolean flag;
		
		for(i=0;i<32;i++){
			sentence[i] = "";
			num[i] = 0;
		}
		
		while(scan.hasNext()){
			token =scan.next();
			flag=false;
			
			for(i=0;i<current;i++){
				if(sentence[i].equals(token)){
					num[i]++;
				}else if(sentence[i].equals("")){
					sentence[i] = token;
					num[i]++;
					flag=true;
				}
			}
			
			if(flag){
				current++;
			}
		}
		
		for(i=0;i<current;i++){
			if(num[max] < num[i]){
				max = i;
			}
		}
		
		for(i=0;i<current;i++){
			if(sentence[maxLen].length() < sentence[i].length()){
				maxLen = i;
			}
		}
		System.out.println(sentence[max] + " " + sentence[maxLen]);
	}
}