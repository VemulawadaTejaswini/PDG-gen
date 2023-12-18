import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int remHeight = 0;
		int remWidth = 0;
		
		List<List<Integer>> listHeight = new ArrayList<>();
		
		//図の作成
		for(int cntHeight = 0 ; cntHeight < height ; cntHeight++){
			String str = sc.next();
			List<Integer> listWidth = new ArrayList<>();
			for(int cntWidth = 0 ; cntWidth < width ; cntWidth++){				
				char chr = str.charAt(cntWidth);
				int a=0;
				if(chr == '#'){
					a=1;
				}		
				listWidth.add(a);
			}
			listHeight.add(listWidth);
		}
		sc.close();

		//横一列が同じだったら削除
		for(int cntHeight = height-1 ; cntHeight > -1 ; cntHeight--){
			int sum = 0;
			for(int cntWidth = 0 ; cntWidth < width ; cntWidth++){				
				sum = sum + listHeight.get(cntHeight).get(cntWidth);			
			}
			if(sum == 0){
				listHeight.remove(cntHeight);
				height--;
			}
		}
		
		//縦一列が同じだったら削除
		for(int cntWidth = width-1 ; cntWidth > -1 ; cntWidth--){
			int sum = 0;
			for(int cntHeight = 0 ; cntHeight < height ; cntHeight++){
				sum = sum + listHeight.get(cntHeight).get(cntWidth);
			}
			
			if(sum == 0){
				for(int cntHeight = 0 ; cntHeight < height ; cntHeight++){
					listHeight.get(cntHeight).remove(cntWidth);					
				}
				width--;
			}
		}
		
		for(int cntHeight = 0 ; cntHeight < height ; cntHeight++){
			for(int cntWidth = 0 ; cntWidth < width ; cntWidth++){	
				if(listHeight.get(cntHeight).get(cntWidth)==1){
					System.out.print("#");
				}else{
					System.out.print(".");
				}
			}
			System.out.println("\n");
		}
	}
}