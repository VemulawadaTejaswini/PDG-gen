public class Main{
	public static void main(String[] args){
		//
		String input = new java.util.Scanner(System.in).nextLine();
		String[] words = input.split("\\s");
                int[] data = new int[3];
		for( int i=0; i < words.length; i++ ){
			data[i]  = Integer.parseInt(words[i]);
		}
		for(int i=0; i < data.length -1 ; i++){
			for(int j=0; j < (data.length -1) - i; j++){
				if(data[j] > data[j+1]){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		for(int i=0; i < data.length ; i++){
			System.out.print(data[i]);
			if( i != (data.length -1)){
				System.out.print(" ");
			}
		}
		System.out.println();
		//
	}
}