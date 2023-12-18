import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			List<Integer> dataset = new ArrayList<Integer>();
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				for(int i = 0; i < 8;i++){
					dataset.add(scan.nextInt());
				}
				int hit = 0 , blow = 0;

				for(int i = 0; i < 4;i++){
					for(int j = 4; j <8;j++){
						if(i == (j-4)){
							if(dataset.get(i) == dataset.get(j))hit++;
						}else{
							if(dataset.get(i) == dataset.get(j))blow++;
						}
					}
				}
				System.out.println(hit +" "+blow);
				dataset.clear();
			}
		}finally{
			scan.close();
		}
	}
}