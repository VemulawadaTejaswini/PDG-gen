
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		//ツカツδ可ーツ表
		int [][] color = {{0,0,0},{0,0,255},{0,255,0},{0,255,255},
				{255,0,0},{255,0,255},{255,255,0},{255,255,255}};
		String [] colorName = {"black","blue", "lime", "aqua", "red", "fuchsia", "yellow", "white"};

		while(true){
			if(n.equals("0")){
				break;
			}
			//ツ禿シツ療債値ツづー10ツ進ツ陛渉環キツつキツづゥ
			int [] nowColor = new int[6];
			for(int i=0; i < nowColor.length; i++){
				if(n.charAt(i+1) - 'a' >= 0){
					nowColor[i] = (n.charAt(i+1) - 'a') + 10;
				}
				else{
					nowColor[i] = n.charAt(i+1) - '0';
				}
			}

			//RGBツづ可つキツづゥ
			int [] nowRGB = new int[3];
			for(int i = 0; i < nowRGB.length; i++){
				nowRGB[i] = nowColor[i*2] << 4 | nowColor[i*2+1];
			}

			//d_kツづーツ仰づ淞、ツ催渉ャツ値ツづーindexツづーツ仰づ淞づゥ
			double min  = Math.pow(nowRGB[0], 2)+ Math.pow(nowRGB[1], 2) + Math.pow(nowRGB[2], 2);
			min = Math.sqrt(min);
			int index = 0;
			for(int i=1; i < color.length; i++){
				double now = Math.pow(color[i][0]-nowRGB[0], 2)+ Math.pow(color[i][1]-nowRGB[1], 2) +
					Math.pow(color[i][2]-nowRGB[2], 2);
				now = Math.sqrt(now);
				if(min > now){
					min = now;
					index = i;
				}
			}

			//ツ出ツ療債つキツづゥ
			System.out.println(colorName[index]);

			n = sc.next();
		}


	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}