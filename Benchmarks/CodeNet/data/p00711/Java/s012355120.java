import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//18:55~19:33 44~54
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0&&h==0) break;
			String gomi = sc.nextLine();
			int[][] map = new int[h][w];
			Queue<Man> st = new LinkedList<>();
			int count=0;
			for(int j=0;j<h;++j){
				String line = sc.nextLine();
				String[] line_b = line.split("");
				for (int i=0;i<w;++i){
					if(line_b[i].matches("#")) map[j][i]=-1;
					else if(line_b[i].matches("@")){
						map[j][i]=1;
						st.add(new Man(i,j));
						count++;
					}
				}
			}
			while(!st.isEmpty()){
				Man syori = st.remove();
				if(-1<syori.remove_y()-1){
					if(map[syori.remove_y()-1][syori.remove_x()]==0){
						st.add(new Man(syori.remove_x(),syori.remove_y()-1));
						map[syori.remove_y()-1][syori.remove_x()]=1;
						count++;
					}
				}
				if(-1<syori.remove_x()-1){
					if(map[syori.remove_y()][syori.remove_x()-1]==0){
						st.add(new Man(syori.remove_x()-1,syori.remove_y()));
						map[syori.remove_y()][syori.remove_x()-1]=1;
						count++;
					}
				}
				if(syori.remove_x()+1<w){
					if(map[syori.remove_y()][syori.remove_x()+1]==0){
						st.add(new Man(syori.remove_x()+1,syori.remove_y()));
						map[syori.remove_y()][syori.remove_x()+1]=1;
						count++;
					}
				}
				if(syori.remove_y()+1<h){
					if(map[syori.remove_y()+1][syori.remove_x()]==0){
						st.add(new Man(syori.remove_x(),syori.remove_y()+1));
						map[syori.remove_y()+1][syori.remove_x()]=1;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

class Man{
	private int x,y;
	Man(int x,int y){
		this.x=x;
		this.y=y;
	}
	int remove_x(){
		return this.x;
	}
	int remove_y(){
		return this.y;
	}
}

