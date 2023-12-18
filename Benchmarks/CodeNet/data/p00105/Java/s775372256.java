import java.util.*;

class Word{
	String name;
	int page[],size;

	public Word(String n){
		name = n;
		page = new int[100];
		size = 0;
	}

	public void addPage(int p){
		page[size++] = p;
	}

	public String getName(){
		return name;
	}

	public void printWord(){
		int i;

		Arrays.sort(page,0,size);

		System.out.println(name);
		for(i=0;i+1<size;i++){
			System.out.print(page[i]+" ");
		}
		System.out.println(page[i]);
	}
}

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Word w[] = new Word[100];
		int size = 0;

		while(true){
			int i;
			String s[];

			if(scan.hasNextLine()){
				s = scan.nextLine().split(" ");
			} else{
				break;
			}

			for(i=0;i<size && !s[0].equals(w[i].getName());i++);
			if(i == size){
				w[size++] = new Word(s[0]);
			}
			w[i].addPage(Integer.parseInt(s[1]));
		}

		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(w[i].getName().compareTo(w[j].getName()) > 0){
					Word tmp = w[i];
					w[i] = w[j];
					w[j] = tmp;
				}
			}
		}

		for(int i=0;i<size;i++){
			w[i].printWord();
		}
	}
}