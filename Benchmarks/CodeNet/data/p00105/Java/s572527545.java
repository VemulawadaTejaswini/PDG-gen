import java.util.*;

class Main{
	static Word[] words;
	static int n;
	static String[] list;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		words = new Word[100];
		list = new String[100];
		n = 0;
		while(sc.hasNext()){
			String s = sc.next();
			int page = sc.nextInt();
			int index = indexOfWord(s);
			if(index == n){
				list[n] = s;
				words[n] = new Word(s);
				words[n].add(page);
				n++;
			}else{
				words[index].add(page);
			}
		}
		sc.close();
		String[] _list = new String[n];
		System.arraycopy(list, 0, _list, 0, n);
		Arrays.sort(_list);
		for(int i = 0 ; i < n ; i++){
			System.out.println(_list[i]);
			output(_list[i]);
		}
	}
	static void output(String s){
		int[] pages = null;
		for(int i = 0 ; i < n ; i++){
			if(words[i].s.equals(s)){
				pages = new int[words[i].n];
				System.arraycopy(words[i].pages, 0, pages, 0, words[i].n);
				Arrays.sort(pages);
			}
		}
		for(int i = 0 ; i < pages.length-1 ; i++){
			System.out.print(pages[i] + " ");
		}
		System.out.println(pages[pages.length-1]);
	}
	static int indexOfWord(String s){
		for(int i = 0 ; i < n ; i++){
			if(list[i] == null || list[i].equals(s)){
				return i;
			}
		}
		return n;
	}
}
class Word{
	String s;
	int[] pages;
	int n;
	Word(String s){
		this.s = s;
		pages = new int[100];
		n = 0;
	}
	void add(int p){
		pages[n] = p;
		n++;
	}
}