import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<BookIndex> indexes = new ArrayList<BookIndex>();
		while(true){
			String str = br.readLine();

			if(str == null){
				break;
			}
			String[] array = str.split(" ");
			String word = array[0];
			int page = Integer.parseInt(array[1]);

			boolean hit = false;
			Iterator<BookIndex> it = indexes.iterator();
			while(it.hasNext()){
				BookIndex tmpIndex = it.next();
				if(tmpIndex.word.equals(word)){
					tmpIndex.addPage(page);
					hit = true;
					break;
				}
			}

			if(!hit){
				indexes.add(new BookIndex(word, page));
			}
			//System.out.println(indexes.size());
		}

		BookIndex[] indexarray = new BookIndex[indexes.size()];
		indexes.toArray(indexarray);
		Arrays.sort(indexarray);
		for(int i = 0; i < indexarray.length ; i++){
			indexarray[i].print();
		}
	}

}

class BookIndex implements Comparable<BookIndex> {
	String word;
	ArrayList<Integer> page;

	public BookIndex (String word, int page){
		this.word = word;
		this.page = new ArrayList<Integer>();
		this.page.add(page);
	}

	@Override
	public int compareTo(BookIndex bookIndex) {
		// TODO ?????????????????????????????????????????????
		return word.compareTo(bookIndex.word);
	}

	public void addPage (int page){
		this.page.add(page);
	}

	public void print(){
		System.out.println(word);
		page.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO ?????????????????????????????????????????????
				if( o1 > o2 ){
					return 1;
				}
				else {
					return -1;
				}
			}

		});
		for(int i = 0; i< page.size() ; i++){
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(page.get(i));
		}
		System.out.println();
	}
}