public class Main{
	public static void main(String[] args){
		//
		String input = new java.util.Scanner(System.in).nextLine();
		String[] words = input.split("\\s");
		int[] data = new int[words.length];
		for(int i=0; i < words.length; i++){
			data[i] = Integer.parseInt(words[i]);
                //        System.out.println(data[i]);
		}
		// W, H, x, y, r
		int w = data[0];
		int h = data[1];
		int x = data[2];
		int y = data[3];
		int r = data[4];
		if( (w >= x+r) && (x-r >= 0) ){
                    //System.out.println("pass");
			if( (h >= y+r) && (y-r >= 0) ){
				System.out.println("Yes");
			}else{
                            System.out.println("No");
                        }
		}else{
			System.out.println("No");
		}
		//
	}
}