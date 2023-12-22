import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder all = new StringBuilder();
		StringBuilder out = new StringBuilder();
		
		while(true){
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if((h + w) <= 0){break;}
			
			//top
			for(int t = 0; t < w; t++){
				out = out.append("#");
			}
			out = out.append("\n");
			
			//center
			
			for(int j = 0; j < (h-2); j++){
				out = out.append("#");
				for(int i = 0; i < (w-2); i++){
						out = out.append(".");
					}
				out = out.append("#");
				out = out.append("\n");
			}
			for(int b = 0; b < w; b++){
				out = out.append("#");
			}
			out = out.append("\n");
			
			all = all.append(out + "\n");
			out.delete(0, out.length());
			
		}
		
		System.out.print(all);
	}
}