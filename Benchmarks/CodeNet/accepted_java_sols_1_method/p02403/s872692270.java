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
				for(int j = 0; j < h; j++){
					for(int i = 0; i < w; i++){
						out = out.append("#");
					}
					out = out.append("\n");
				}
			all = all.append(out + "\n");
			out.delete(0, out.length());
		}
	
		System.out.print(all);
	}
}
