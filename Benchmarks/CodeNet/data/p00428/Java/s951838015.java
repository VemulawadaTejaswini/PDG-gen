import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);

			if(n == 0 && m == 0){
				break;
			}
			
			Place[] places = new Place[m];
			for(int i = 0; i < m; i++){
				places[i] = new Place(i + 1);
			}
			
			for(int i = 0 ; i < n; i++){
				tmpArray = br.readLine().split(" ");
				for(int j = 0; j < m; j++){
					if(Integer.parseInt(tmpArray[j]) == 1){
						places[j].want++;
					}
				}
			}
			
			Arrays.sort(places, new Comparator<Place>() {
				public int compare(Place a, Place b){
					if(a.want > b.want){
						return -1;
					}
					else if(a.want < b.want){
						return 1;
					}
					else {
						return 0;
					}
				}
			});
			
			for(int i = 0; i < m; i++){
				if(i != 0){
					System.out.print(" ");
				}
				
				System.out.print(places[i].id);
			}
			System.out.println();
		}
	}

}

class Place {
	int id;
	int want = 0;
	
	public Place(int id){
		this.id = id;
	}
}