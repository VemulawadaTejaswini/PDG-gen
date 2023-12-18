import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int cave_nums = sc.nextInt();
	
	for(int i=0;i<cave_nums;i++){
	    int x,y,now_x=0,now_y=0;
	    double tmp_dist = 0;
	    String tmp_treasure="";
	    int tmp_x=0;
	    while(true){
		x = sc.nextInt();
		y = sc.nextInt();
		if(x == 0 && y == 0)break;
		now_x = now_x + x;
		now_y = now_y + y;
		if(tmp_dist < Math.pow(now_x,2) + Math.pow(now_y,2)){
		    tmp_treasure = Integer.toString(now_x) +  " " + Integer.toString(now_y);
		    tmp_dist = Math.pow(now_x,2) + Math.pow(now_y,2);
		    tmp_x = now_x;
		}else if(tmp_dist == Math.pow(now_x,2) + Math.pow(now_y,2)){
		    if(now_x>tmp_x){
			tmp_treasure = Integer.toString(now_x) +  " " + Integer.toString(now_y);
			tmp_dist = Math.pow(now_x,2) + Math.pow(now_y,2);
			tmp_x = now_x;
		    }
		}
      	    }
	    System.out.println(tmp_treasure);
	}
    }
}