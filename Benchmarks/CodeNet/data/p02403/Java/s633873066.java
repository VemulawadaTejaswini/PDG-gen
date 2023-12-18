import java.util.Scanner;

class Main {
	static void drawBox(int w, int h){
		for(int i = 0; i < w; i ++){
			System.out.print("#");
		}
		
		System.out.print("\n");
		
		for(int i = 0; i < h - 2; i ++){
			for(int j = 0; j < w; j ++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
		
		for(int i = 0; i < w; i ++){
			System.out.print("#");
		}
		
		System.out.print("\n");
	}
	
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	
    	while(in.hasNextLine()){
    		int h = in.nextInt(), w = in.nextInt();
    		if(w == 0 && h == 0){
    			break;
    		}else{
    			drawBox(w, h);
    		}
       	}
    	
    	in.close();
	}
}