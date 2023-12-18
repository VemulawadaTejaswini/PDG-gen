import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String in = sc.next();
			
			if("-".equals(in)){
				break;
			}
			
			char[] red = in.toCharArray();
			char[] green  = sc.next().toCharArray();
			char[] down  = sc.next().toCharArray();
			
			//System.out.println("start");
			
			int red_progress = 0;
			int green_progress = 0;
			char center = 0;
			for(int d = 0; d < down.length; d++){
				//System.out.println(d + " " + red_progress + " " + green_progress + " " + center);
				
				
				int red_pos = -1;
				for(int i = 0; i < red.length; i++){
					if(red[i] == down[d]){
						red_pos = i;
						break;
					}
				}
				
				int green_pos = -1;
				for(int i = 0; i < green.length; i++){
					if(green[i] == down[d]){
						green_pos = i;
						break;
					}
				}
				
				if(center == down[d]){
					red_progress++;
					center = red[red_progress-1];
				}else if(red_pos >= 0){
					final int move = red_pos - red_progress + 1;
					
					red_progress += move;
					center = red[red_progress - 1];
				}else{
					final int move = green_pos - green_progress + 1;
					
					if(center != 0){
						System.out.print(center);
					}
					
					//System.out.println(green_progress + " " + (green_progress + move - 1));
					for(int disp = green_progress; disp < green_progress + move - 1; disp++){
						
						System.out.print(green[disp]);
					}
					
					green_progress += move;
					red_progress += 1;
					center = red[red_progress - 1];
				}
			}
			
			System.out.print(center);
			
			if(red_progress < red.length){
				System.out.print(red[red.length - 1]);
			}else if(green_progress < green.length){
				System.out.print(green[green.length - 1]);
			}
			System.out.println();
		}
		
	}

}