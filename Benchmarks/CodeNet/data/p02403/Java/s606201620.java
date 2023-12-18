import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder all = new StringBuilder();
		StringBuilder out = new StringBuilder();
		
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if((H + W) <= 0){break;}
				for(int j = 0; j < H; j++){
					for(int i = 0; i < W; i++){
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
