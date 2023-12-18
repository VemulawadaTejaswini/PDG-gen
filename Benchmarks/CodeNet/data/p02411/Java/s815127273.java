import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int[] arr = parceIntArray(br.readLine().split(" "));
			Score score = new Score(arr[0], arr[1], arr[2]);
			if(score.equals(new Score(-1, -1, -1))){
				break;
			}else{
				System.out.println(score.getGrade());
			}
		}
	}
	
	private static int[] parceIntArray(String[] strArr){
		int[] arr = new int[strArr.length];
		for(int i = 0;i < arr.length;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		return arr;
	}
}

class Score {
	int midterm;
	int term;
	int makeUp;

	Score(int midterm, int term, int makeUp) {
		this.midterm = midterm;
		this.term = term;
		this.makeUp = makeUp;
	}

	String getGrade() {
		int finalScore = midterm + term;
		String result;
		if (midterm == -1 || term == -1 || finalScore < 30) {
			result = "F";
		} else if (finalScore < 50) {
			if (makeUp >= 50) {
				result = "C";
			} else {
				result = "D";
			}
		}else if(finalScore < 65){
			result = "C";
		}else if(finalScore < 80){
			result = "B";
		}else{
			result = "A";
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + makeUp;
		result = prime * result + midterm;
		result = prime * result + term;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (makeUp != other.makeUp)
			return false;
		if (midterm != other.midterm)
			return false;
		if (term != other.term)
			return false;
		return true;
	}
	
}