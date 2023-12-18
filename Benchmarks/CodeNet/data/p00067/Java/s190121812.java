
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);




		while(scanner.hasNext()){

			Human human=new Human();

			for(int i =0;i<12;i++){

				String st=scanner.next();

				for(int k =0;k<12;k++){

					if(st.charAt(k)=='1'){

						human.map[k][i]=true;
					}


				}
			}


			int count=0;

			for(int i=0;i<12;i++){
				


				for (int k=0;k<12;k++){
					if(human.map[k][i]){
						human.Advent(k,i);//この処理で到達した島はすべて海になるため検索に引っかかることはなくなる
						count=count+1;//島の数をカウント
					}


				}


			}

			System.out.println(count);

		}

	}


}

class Human {

	int x;
	int y;//humanの現在の座標
	Human(){
		x= 0;
		y= 0;
	}
	boolean[][] map = new boolean[12][12]; //地図


	public void Advent(int x, int y){


		map[x][y]=false;//行ったことのある場所は海に

		//再帰処理で陸続きの場所をすべて沈める
		if(x<11){
			if(map[x+1][y]){
				Advent(x+1,y);
			}
		}
		if(x>0){
			if(map[x-1][y]){
				Advent(x-1,y);
			}
		}
		if(y<11){
			if(map[x][y+1]){
				Advent(x,y+1);
			}
		}
		if(y>0){
			if(map[x][y-1]){
				Advent(x,y-1);
			}
		}

	}



}


