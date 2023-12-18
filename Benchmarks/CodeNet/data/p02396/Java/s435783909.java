public class Main{
	public static void main(String[] args){
		//
    int[] data = new int [10000];
		for(int i=0; i < 10000; i++){
			String input = new java.util.Scanner(System.in).nextLine();
			data[i] = Integer.parseInt(input);
			if( data[i] == 0){
				break;
			}
		}
		for(int i=0; i < 10000; i++){
			if( data[i] == 0){
				break;
			}
			System.out.print("Case "+ i + ":" + data[i]);
		}
		//
	}
}