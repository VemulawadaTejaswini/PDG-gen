import java.util.Scanner;

public class Main {
	
	int w,h;
	int[][] stage;
	int deepMax;
	int time;
	
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			deepMax = 0;
			time = -1;
		
			String str = sc.nextLine();
			String piace[] = str.split("[\\s]+");
			
			w = Integer.parseInt(piace[0]);
			h = Integer.parseInt(piace[1]);
			
			if(w == 0 && h == 0)
				break;
			
			stage = new int[w][h];
			
			for(int i = 0; i < h; i++){
				str = sc.nextLine();
				piace = str.split("[\\s]+");
				
				for(int j = 0; j < w; j++){
					if(piace[j].equals("."))
						stage[j][i] = 0;
					else if(piace[j].equals("S"))
						stage[j][i] = -1;
					else if(piace[j].equals("G"))
						stage[j][i] = -2;
					else
						stage[j][i] = Integer.parseInt(piace[j]);
				}
			}
			
			//??????
			for(int i = 0; i < h; i++)
				for(int j = 0; j < w; j++)
					if(stage[j][i] > deepMax){
						deepMax = stage[j][i];
					}
			//System.out.println(deepMax);
			
			for(int i = 0; i < h; i++)
				for(int j = 0; j < w; j++)
					if(stage[j][i] == -1){
						//System.out.println(j + "," + i);
						timePass(1,j,i,0);
					}
			
			System.out.println(time);
			
		}
	}
	
	public void timePass(int target, int x, int y, int time){
		for(int i = 0; i < h; i++)
			for(int j = 0; j < w; j++){
				if(stage[j][i] == target){
					
					int dx,dy;
					dx = x - j;
					if(dx < 0)
						dx =dx *  -1;
					
					dy = y - i;
					if(dy < 0)
						dy =dy * -1;
					
					int timer;
					timer = time + dx + dy;
					//System.out.println("???????????????" + time + "," + j + "," + i + "," + target);
					
					if(target == deepMax)
						timePass(-2,j,i,timer);
					
					else if(target == -2){ //???????????¶
						//System.out.println("a");
						if(this.time == -1){
							this.time = timer;
						}else if(this.time > timer){
							this.time = timer;
						}
					}else
						timePass(target + 1,j,i,timer);
					
				}
			}
	}
	
	public static void main(String[] args){
		
		Main ka = new Main();
		
	}

}