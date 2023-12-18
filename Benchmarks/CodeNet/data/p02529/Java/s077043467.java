import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	ArrayList<String>	list;
	ArrayList<Integer>	numList1,numList2;
	int count = 0;

	public Main(){
		list = new ArrayList<String>();
		numList1 = new ArrayList<Integer>();
		numList2 = new ArrayList<Integer>();
	}


	public void start(){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			//BufferedReader br = new BufferedReader(new FileReader("sampleData/id10030D.txt"));
			while((str=br.readLine())!=null){
				list.add(str.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] s1	=	list.get(1).split(" ");
		String[] s2 =	list.get(3).split(" ");

		for(int i=0; i<s1.length; i++){
			numList1.add(Integer.parseInt(s1[i]));
		}
		for(int i=0; i<s2.length; i++){
			numList2.add(Integer.parseInt(s2[i]));
		}

		for(int i=0; i<numList1.size(); i++){
			for(int j=0; j<numList2.size(); j++){
				if(numList1.get(i) == numList2.get(j)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		new Main().start();
	}
}