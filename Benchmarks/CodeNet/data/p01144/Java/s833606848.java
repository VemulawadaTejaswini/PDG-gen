import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int n = Integer.parseInt(tmpArray[0]);
			int budget = Integer.parseInt(tmpArray[1]);

			if(n == 0 && budget == 0){
				break;
			}

			Section[] sections = new Section[n];
			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");
				sections[i] = new Section(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]));
			}

			Arrays.sort(sections);

			int sum = 0;
			for(int i = 0; i < n; i++){
				int p = sections[i].probablity;

				int cost = Math.min(budget, sections[i].distance);

				sum += (sections[i].distance - cost)*p;
				budget -= cost;

//				System.out.println("p "+p+"budge "+budget);
//				sum += Math.max(0, p - budget);
//				budget = Math.max(0, budget - p);
			}

			System.out.println(sum);
		}
	}

}

class Section implements Comparable<Section>{
	int distance;
	int probablity;

	public Section(int d, int p){
		this.distance = d;
		this.probablity = p;
	}

	@Override
	public int compareTo(Section o) {
		// TODO ?????????????????????????????????????????????
		return -(this.probablity - o.probablity);
	}
}