import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			int i = 1;
			int j = 1;
			int theta = 90;
			while(true){
				String str = scan.next();
				if(str.equals("STOP")){
					break;
				}else if(str.equals("LEFT")){
					theta += 90;
					continue;
				}else if(str.equals("RIGHT")){
					theta -= 90;
					continue;
				}
				int step = scan.nextInt();
				if(str.equals("FORWARD")){
					i += step*Math.cos(theta*Math.PI/180);
					j += step*Math.sin(theta*Math.PI/180);
				}else{
					i -= step*Math.cos(theta*Math.PI/180);
					j -= step*Math.sin(theta*Math.PI/180);
				}
				i = (i < 1)?1:(i > x)?x:i;
				j = (j < 1)?1:(j > y)?y:j;
			}
			System.out.println(i + " " + j);
        }
	}
}