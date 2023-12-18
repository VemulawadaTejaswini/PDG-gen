import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String[] cipher = line.split(" ");
			char[][] minCh = new char[cipher.length][];
			char[][] maxCh = new char[cipher.length][];
			int i,j,k;
			int minWord = 'z';
			int maxWord = 'a';
			
			for(i=0;i<cipher.length;i++){
				minCh[i] = cipher[i].toCharArray();
				maxCh[i] = cipher[i].toCharArray();
			}
			
			for(i=0;i<cipher.length;i++){
				for(j=0;j<minCh[i].length;j++){
					if(minCh[i][j] != '.' && minCh[i][j] != ' '){
						if(minCh[i][j] < minWord){
							minWord = minCh[i][j];
						}
						if(minCh[i][j] > maxWord){
							maxWord = minCh[i][j];
						}
					}
				}
			}
			
			
			int flag = 0;
			String[] str = new String[cipher.length];
			one : for(i=minWord;i>'a';i--){
				for(j=0;j<cipher.length;j++){
					for(k=0;k<minCh[j].length;k++){
						if(minCh[j][k] != '.' && minCh[j][k] != ' '){
							minCh[j][k] = (char)(minCh[j][k]-1);
						}
					}
				}
				
				for(j=0;j<cipher.length;j++){
					str[j] = String.valueOf(minCh[j]);
				}
				
				for(j=0;j<cipher.length;j++){
					if(str[j].equals("the") || str[j].equals("this") || str[j].equals("that")
							|| str[j].equals("the.") || str[j].equals("this.") || str[j].equals("that.")){
						flag = 1;
						break one;
					}
				}
			}
			
			if(flag == 0){
				two : for(i=maxWord;i<'z';i++){
					for(j=0;j<cipher.length;j++){
						for(k=0;k<maxCh[j].length;k++){
							if(maxCh[j][k] != '.' && maxCh[j][k] != ' '){
								maxCh[j][k] = (char)(maxCh[j][k]+1);
							}
						}
					}
					
					for(j=0;j<cipher.length;j++){
						str[j] = String.valueOf(maxCh[j]);
					}
					
					for(j=0;j<cipher.length;j++){
						if(str[j].equals("the") || str[j].equals("this") || str[j].equals("that")
								|| str[j].equals("the.") || str[j].equals("this.") || str[j].equals("that.")){
							break two;
						}
					}
				}
			}
			
			String s = new String("");
			for(i=0;i<cipher.length-1;i++){
				s += (str[i]+" ");
			}
			s+=str[cipher.length-1];
			System.out.println(s);
			
		}
	}
}