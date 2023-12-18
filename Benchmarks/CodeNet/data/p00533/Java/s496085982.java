public class main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] section = new int[h][w];
		for (int i = 0; i < h; i++){
			char [] wether = sc.next().toCharArray();
			int count = 0;
			for(int j = 0; j < w; j++){
				if(wether[j] == 'c'){
					count = 0;
				}else if(wether[j] == '.'){
					count = -1;
				}
				if(count >= 0){
					count++;
					section[i][j] = count;
				}
				for ( i = 0; i < h; i++){
					for( j = 0; j < w; j++){
						if(j != w-1){
							System.out.print(section[i][j]+"");
						}else{
							System.out.print(section[i][j]);
						}
					}
				}
			}
		}
	}
}