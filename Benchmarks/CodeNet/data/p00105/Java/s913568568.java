import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) throws IOException{
		IndexList index = new IndexList();
		index.show();
	}
}

class IndexList{
	private Object[] index;
	public IndexList() throws IOException{
		index = createIndex();
	}
	private Object[] createIndex() throws IOException{
		ArrayList<String[]> index = new ArrayList<String[]>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		while((buf = bf.readLine()) != null){
			index.add(buf.split(" "));
		}
		return index.toArray();
	}
	public void show(){
		sort();
		String word = ((String[])index[0])[0];
		for(int i = 0; i < index.length; i++){
			StringBuffer buf = new StringBuffer();
			String[] data = (String[])index[i];
			word = (word.compareTo(data[0]) == 0)? word : data[0];
			System.out.println(word);
			buf.append(data[1]);
			while(i + 1 < index.length && word.compareTo(((String[])index[i + 1])[0]) == 0){
				buf.append(" " + ((String[])index[++i])[1]);
			}
			System.out.println(buf.toString());
		}
	}
	private void sort(){
		Arrays.sort(index, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				int difference = ((String[])o1)[0].compareTo(((String[])o2)[0]);
				if(difference == 0){
					return Integer.parseInt(((String[])o1)[1]) - Integer.parseInt(((String[])o2)[1]);
				}else{
					return difference;
				}
			}
		});	
	}
}