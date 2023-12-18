import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		int taroPoint=0;
		int hanakoPoint=0;
		
		for(int i=0;i<n;i++){
			String[] word = sc.nextLine().split(" ");
			if(word[0].equals(word[1])){
				taroPoint+=1;
				hanakoPoint+=1;
			}else{
				int wordlength = word[0].length();
				if(wordlength>word[1].length()){
					wordlength=word[1].length();
				}
				for(int j=0;j<wordlength;j++){
					if(word[0].charAt(j)>word[1].charAt(j)){
						taroPoint+=3;
						break;
					}else if(word[0].charAt(j)<word[1].charAt(j)){
						hanakoPoint+=3;
						break;
					}
					if(j==wordlength-1){
						if(word[0].length()>word[1].length()){
							taroPoint+=3;
						}else{
							hanakoPoint+=3;
						}
					}
				}
			}
		}
		System.out.println(taroPoint+" "+hanakoPoint);
	}
}