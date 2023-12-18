import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {
	
	int before_north, before_south, before_west, before_east, before_top, before_bottom;
	int after_north, after_south, after_west, after_east, after_top, after_bottom;
	
	
	public void read(){
		try {
			//ファイルを読み込む
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			//読み込んだファイルを１行ずつ画面出力する
			while(true){
				initial();
				String line, st;
				int sum = 1;
				line = br.readLine();
				
				//System.out.println(line);
				
				if(Integer.parseInt(line) == 0) break;

				for(int i=0; i<Integer.parseInt(line); i++){

					st = br.readLine();
					
					if(st.equals("North")){
						after_north = before_top;
						after_top = before_south;
						after_south = before_bottom;
						after_bottom = before_north;
					}
					else if(st.equals("South")){
						after_north = before_bottom;
						after_top = before_north;
						after_south = before_top;
						after_bottom = before_south;
					}
					else if(st.equals("East")){
						after_west = before_bottom;
						after_top = before_west;
						after_east = before_top;
						after_bottom = before_east;
					}
					else if(st.equals("West")){
						after_west = before_top;
						after_top = before_east;
						after_east = before_bottom;
						after_bottom = before_west;
					}
					else if(st.equals("Right")){
						after_north = before_west;
						after_west = before_south;
						after_south = before_east;
						after_east = before_north;
					}
					else if(st.equals("Left")){
						after_north = before_east;
						after_west = before_north;
						after_south = before_west;
						after_east = before_south;
					}
					sum += after_top;
					//更新
					before_north = after_north;
					before_south = after_south;
					before_west = after_west;
					before_east = after_east;
					before_top = after_top;
					before_bottom = after_bottom;
				}
				System.out.println(sum);
			}
			//終了処理
			br.close();
			fr.close();

		} catch (IOException ex) {
			//例外発生時処理
			ex.printStackTrace();
		}
	}

	public void initial(){
		before_top = 1;
		before_bottom = 6;
		before_north = 5;
		before_south = 2;
		before_west = 4;
		before_east = 3;
		after_top = 1;
		after_bottom = 6;
		after_north = 5;
		after_south = 2;
		after_west = 4;
		after_east = 3;
	}
	
	public static void main(String[] args){
		Main op = new Main();
		op.read();
                return;
	}
}