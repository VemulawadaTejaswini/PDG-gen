import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	ArrayList<String>	list = new ArrayList<String>();
	int[] numList1,numList2;
	int count = 0;


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

		int fact1 = Integer.parseInt(list.get(0));
		int fact2 = Integer.parseInt(list.get(2));
		numList1 = new int[fact1];
		numList2 = new int[fact2];
		String[] s1	=	list.get(1).split(" ");
		String[] s2 =	list.get(3).split(" ");

		for(int i=0; i<fact1; i++){
			numList1[i] = Integer.parseInt(s1[i]);
		}
		for(int i=0; i<fact2; i++){
			numList2[i] = Integer.parseInt(s2[i]);
		}

		for(int i=0; i<fact1; i++){
			for(int j=0; j<fact2; j++){
				if(numList1[i] == numList2[j]){
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