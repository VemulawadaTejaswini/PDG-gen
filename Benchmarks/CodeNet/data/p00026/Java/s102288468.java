import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		int[][] map = new int[10][10];
		BufferedReader br = null;
		int max = 0,num = 0;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			String buf;int d=0;
			while((buf = br.readLine())!=null){
				if(d++ == 5)break;
				String[] data = buf.split(",");
				int x = new Integer(data[0]);
				int y = new Integer(data[1]);
				int point = new Integer(data[2]);
				switch(point){
				case 3:
					for(int i = -2; i <=2; i+=4){
							if(check(x+i ,y))
									map[x+i][y]++;
							if(check(x,y+i))
								map[x][y+i]++;
					}
				case 2:
					for(int i = -1 ; i <=1; i+=2){
						for(int j = -1 ; j <=1 ;j +=2){
							if(check(x+i,y+j))
								map[x+i][y+j]++;
						}
					}
				case 1:
					for(int i = -1; i <=1; i+=2){
						if(check(x+i ,y))
								map[x+i][y]++;
						if(check(x,y+i))
							map[x][y+i]++;
					}
					map[x][y]++;
				}
			}
			for(int i = 0; i < map.length;i++){
				for(int j = 0; j < map[i].length;j++){
					if(map[i][j] == 0)num++;
					max = Math.max(max,map[i][j]);
				}
			}

		}finally{
			br.close();
		}
		System.out.println(num);
		System.out.println(max);
	}
		static boolean check(int x , int y){
			if(x > 9 || x < 0 || y > 9 || y < 0)return false;
			return true;
		}
}