import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Dice {
	
	int top, bottom, north, south, west, east;
	
	public Dice(){
		this.top = 1;
		this.bottom = 6;
		this.north = 5;
		this.south = 2;
		this.west = 4;
		this.east = 3;
	}
	
	public void initial(){
		this.top = 1;
		this.bottom = 6;
		this.north = 5;
		this.south = 2;
		this.west = 4;
		this.east = 3;
	}
}

public class Operation {
	public Dice before = new Dice();
	public Dice after = new Dice();
	
	
	public void read(){
		try {
			//ファイルを読み込む
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);

			//読み込んだファイルを１行ずつ画面出力する

			
			
			while(true){
				
				String line, st;
				int sum = 1;
				line = br.readLine();
				
				//System.out.println(line);
				
				if(Integer.parseInt(line) == 0) break;

				for(int i=0; i<Integer.parseInt(line); i++){

					st = br.readLine();
					
					if(st.equals("North")){
						after.north = before.top;
						after.top = before.south;
						after.south = before.bottom;
						after.bottom = before.north;
					}
					else if(st.equals("South")){
						after.north = before.bottom;
						after.top = before.north;
						after.south = before.top;
						after.bottom = before.south;
					}
					else if(st.equals("East")){
						after.west = before.bottom;
						after.top = before.west;
						after.east = before.top;
						after.bottom = before.east;
					}
					else if(st.equals("West")){
						after.west = before.top;
						after.top = before.east;
						after.east = before.bottom;
						after.bottom = before.west;
					}
					else if(st.equals("Right")){
						after.north = before.west;
						after.west = before.south;
						after.south = before.east;
						after.east = before.north;
					}
					else if(st.equals("Left")){
						after.north = before.east;
						after.west = before.north;
						after.south = before.west;
						after.east = before.south;
					}
					sum += after.top;
					//更新
					before.north = after.north;
					before.south = after.south;
					before.west = after.west;
					before.east = after.east;
					before.top = after.top;
					before.bottom = after.bottom;
				}
				System.out.println(sum);
				before.initial();
				after.initial();
			}
			//終了処理
			br.close();
			fr.close();

		} catch (IOException ex) {
			//例外発生時処理
			ex.printStackTrace();
		}
	}

	public static void main(String[] args){
		
		Operation op = new Operation();
		
		op.read();

	}

}