import java.util.*;

class main{
	public static void main(String[] args){
		Scanner[] i = new Scanner[10];
		


		for(int j=0; j<10; j++){
			i[j] = new Scanner(System.in);
		}
		
		Arrays.sort(i);

		for(int j=9; j>6; j--){
			System.out.println(i[j]);
		}

	}
}