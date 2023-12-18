import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int count = 0;
			String word = scan.nextLine();
			int num = Integer.parseInt(scan.nextLine());
			for(int i=0;i<num;i++){
				count += app.searchRing(word,scan);
			}
			System.out.println(count);
		}
	}
	
	public int searchRing(String word,Scanner scan){
		String ring = scan.nextLine();
		int ringLen = ring.length();
		int wordLen = word.length();
		for(int i=0;i<ringLen;i++){
			String str = new String();
			if(i+wordLen > ringLen){
				str = ring.substring(i,ringLen);
				str += ring.substring(0,wordLen-str.length());
				if(str.equals(word)){
					return 1;
				}
			}else{
				str = ring.substring(i,i+wordLen);
				if(str.equals(word)){
					return 1;
				}
			}
		}
		return 0;
	}
}