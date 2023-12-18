import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int n = Integer.parseInt(tmpArray[0]);
			int k = Integer.parseInt(tmpArray[1]);
			
			if(n == 0 && k == 0){
				break;
			}
			boolean[] exist = new boolean[n+1];
			
			for(int i = 0; i < k ; i++){
				exist[Integer.parseInt(br.readLine())] = true;
			}
			
			ArrayList<Section> list = new ArrayList<Section>();
			boolean inSection = false;
			Section sec = null;
			for(int  i = 1; i <= n; i++){
				if(exist[i] == true && inSection == false){
					sec = new Section(i, i);
					inSection = true;
				}
				
				if(inSection == true && (i == n || exist[i+1] == false)){
					sec.end = i;
					list.add(sec);
					inSection = false;
//					System.out.println("start "+ sec.start + " end "+sec.end);
					
				}
			}
			//????´???????????????????
			if(exist[0] == false){
				Iterator<Section> it = list.iterator();
				int lenMax = 0;
				while(it.hasNext()){
					Section tmp = it.next();
					if(tmp.numOfNumbers() > lenMax){
						lenMax = tmp.numOfNumbers();
					}
				}
				
				System.out.println(lenMax);
			}
			
			else {
				Iterator<Section> it = list.iterator();
				Section first = it.next();
				Section second = null;
				
				int lenMax = first.numOfNumbers();
				while(it.hasNext()){
					second = it.next();
					int tmpLen = second.numOfNumbers();
					if(second.start - first.end == 2){
						tmpLen += first.numOfNumbers() + 1;
					}
					
					if(lenMax < tmpLen){
						lenMax = tmpLen;
					}
					
					first = second;
				}
				
				System.out.println(lenMax);
			}
		}
	}

}

class Section {
	int start;
	int end;
	
	public Section(int s, int e){
		this.start = s;
		this.end = e;
	}
	
	public int numOfNumbers(){
		return end - start + 1;
	}
}