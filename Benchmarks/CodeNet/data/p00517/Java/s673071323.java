import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int spot[][]=new int [n][2];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<2; j++)
				spot[i][j]=sc.nextInt();
			
		int WhereX=spot[0][0];
		int WhereY=spot[0][1];
		
		
		int counter = 0;
		for(int i=1; i<=n;){//どこ目指してるの
			int x = WhereX-spot[i][0]; //差 -ならもっと左、+ならもっと右
			int y = WhereY-spot[i][1]; //差 -ならもっと上、+ならもっと下

			if(x==0 && y==0) //目的地
				i++; //次へ
			else if(x!=0 && y!=0){ //どっちも違う  AAA
				if(x<0 && y<0){   //どちらももっと上
					WhereX++;
					WhereY++;
				}
				else if(x>0 && y>0) {   //どちらももっと下
					WhereX--;
					WhereY--;
				}
				else if(x<0) WhereX++;
				else if(y>0) WhereY--;

			}  // AAA
			else if(x!=0){ //xだけ違う
				if(x<0) WhereX++; //右
				else if(x>0) WhereX--;
			}
			else if(y!=0){ //yだけ違う
				if(y<0) WhereY++;
				else if(y>0) WhereY--;
			}
		
			counter++;
		}
		
		System.out.println(counter);

	}
}