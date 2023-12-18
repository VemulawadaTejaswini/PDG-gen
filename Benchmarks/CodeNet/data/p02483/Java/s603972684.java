import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] ucie = new int[4];
		try{
			ucie[0] = Integer.valueOf(input.next());
			ucie[1] = Integer.valueOf(input.next());
			ucie[2] = Integer.valueOf(input.next());
		}catch(Exception e){
			System.out.println("ツづ篠ーツつゥ");
		}
		for(int i = 0; i < 2; i++){
			for(int j = i + 1; j < 3; j++){
				if(ucie[i] > ucie[j]){
					ucie[3] = ucie[i];
					ucie[i] = ucie[j];
					ucie[j] = ucie[3];
				}
			}
		}
		System.out.println(ucie[0] + " " + ucie[1] + " " + ucie[2]);
	}
}