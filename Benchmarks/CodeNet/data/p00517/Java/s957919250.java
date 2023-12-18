import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int spot[][]=new int [n][2];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<2; j++)
				spot[i][j]=sc.nextInt();
			
		int X=spot[0][0];
		int Y=spot[0][1];
		
		for(int i=1; i<=n;){//どこ目指してるのかな
			if(i==n) break;
			int whex=spot[i][0] - X;
			int whey=spot[i][1] - Y;
			if(whex!=0 && whey!=0){  //どっちも違う
				if(whex>0 && whey>0){ //右上
					X++;
					Y++;
					counter+=1;
				}
				else if(whex<0 && whey<0){ //左下
					X--;
					Y--;
					counter+=1;
				}
				else if(whex>0 && whey<0){ //右下
					X++;
					Y--;
					counter+=2;
				}
				else if(whex<0 && whey>0){ //左上
					X--;
					Y++;
					counter+=2;
				}
			}
			else if(whex==0 && whey!=0){ //Xは同じ
				if(whey>0) Y++;
				else if(whey<0) Y--;
				counter+=1;
			}
			else if(whex!=0 && whey==0){ //Yは同じ
				if(whex>0) X++;
				else if(whex<0) X--;
				counter+=1;
			}
			
			else if(whex==0 && whey==0){
				i++;
			}
			
			
		}
		
		System.out.println(counter);


	}

}