import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		String[][] square = new String[H+2][W+2];
		for(int i =1;i<=H;i++){
			String s = sc.nextLine();
			for(int j =1;j<=W;j++){
				square[i][j] =s.substring(j-1,j);

			}
		}
		int flg = 0;
		for(int i =1;i<=H;i++){
			for(int j =1;j<=W;j++){
				if(square[i][j].equals("#")){
					int a=1,b=1,c=1,d=1;
					if(square[i-1][j]!=null){
						if(square[i-1][j].equals("#")){
							a =0;
						}
					}
					if(square[i+1][j]!=null){
						if(square[i+1][j].equals("#")){
							b =0;
						}
					}
					if(square[i][j-1]!=null){
						if(square[i][j-1].equals("#")){
							c =0;
						}
					}
					if(square[i][j+1]!=null){
						if(square[i][j+1].equals("#")){
							d =0;
						}
					}
					if(a==0||b==0||c==0||d==0){

					}else{
						flg =1;
					}
				}

			}
		}
		if(flg==1){
			System.out.println("No");
		}else if(flg==0){
			System.out.println("Yes");
		}
	}

}
