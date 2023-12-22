import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int h,w;
		
		Scanner in = new Scanner(System.in);
		while(true){
			h = Integer.parseInt( in.next() );
			w = Integer.parseInt( in.next() );
			
			if(h==0&&w==0) break;
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
			
			System.out.print("\n");
		}
	}
}