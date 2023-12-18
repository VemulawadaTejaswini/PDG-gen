import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		n = sc.nextInt();
		char[] key,word;
		key = sc.next().toCharArray();
		for (int i = 0; i < n; i++) {
			word = sc.next().toCharArray();
Word:			for(int k = 0;k < word.length;k++){
				//System.out.println("1??????????????¢?????????");
				//System.out.println( key[0] +" " +word[k]);
				for(int l = k+1;l < key.length;l++){
					if(key[0] != word[k])break;
					//System.out.println("2??????????????¢?????????");
					//System.out.println( key[1] +" " +word[l]);
					for(int m = 2;m <= word.length;m += (l-k)){
						if(key[1] != word[l])break;
						//System.out.println((m+1)+"??????????????¢?????????");
						if(m == key.length-2){
							cnt++;
							break Word;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}