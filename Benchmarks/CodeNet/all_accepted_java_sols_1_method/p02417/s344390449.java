import java.util.*;
 
class Main{
    public static void main(String[] args){
		char a = 'a';
		int[] arr = new int[26];
		Scanner scan = new Scanner(System.in);
		String str = "";
		while(scan.hasNext()) {
            String buf = scan.nextLine();
            str += buf;
        }

		char[] ch = str.toLowerCase().toCharArray();
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