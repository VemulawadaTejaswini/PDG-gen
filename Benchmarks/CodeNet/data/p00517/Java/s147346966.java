import java.util.Scanner;

public class Main {
	
	public int now_x;
	public int now_y;
	public int min = 0;
	
	public Main(){
	}
		
	public int walk(int por_x,int por_y){
		int x = por_x - now_x;
		int y = por_x - now_y;
		
		if(x > 0 && y > 0){
            min += Math.min(x, y);
            min += Math.abs(x - y);
        }else if(x < 0 && y > 0){
            x = -x;
            min += x + y;
        }else if(x < 0 && y < 0){
            x = -x;
            y = -y;
            min += Math.min(x, y);
            min += Math.abs(x - y);
        }else if(x > 0 && y < 0){
            y = -y;
            min += x + y;
        }else if(x == 0 && y != 0){
            min += Math.abs(y);
        }else if(x != 0 && y == 0){
            min += Math.abs(x);
        }
         
        now_x = por_x;
        now_y = por_y;
        
        return min;
	}
	
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        now_x = sc.nextInt();
        now_y = sc.nextInt();
        int answer = 0;
        for(int i = 0;i < N - 1;i++){
        	int por_x = sc.nextInt();
        	int por_y = sc.nextInt();
        	answer += walk(por_x,por_y);
        }
        System.out.println(answer);
	}
	
    public static void main(String[] args){
        Main m = new Main();
    	m.doIt();
	}
}