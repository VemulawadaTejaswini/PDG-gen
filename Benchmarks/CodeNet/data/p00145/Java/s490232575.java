import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			ArrayList<int[]> updownList= new ArrayList<int[]>();
			
			for(int i = 0; i < n; i++){
				int[] list = {sc.nextInt(),sc.nextInt()};
				updownList.add(list);
			}
			int ncount;
			int geti = 0;
			int getj = 0;
			int topx = 0;
			int topy = 0;
			int downx = 0;
			int downy = 0;
			int sum = Integer.MAX_VALUE;
			int listsum = 0;
			int[] listi = new int[2];
			int[] listj = new int[2];
			while(true){
				ncount = updownList.size();
				if(ncount == 1){
					break;
				}
				for(int i = 0; i < ncount; i++){
					listi = updownList.get(i);
					for(int j = i + 1; j < ncount; j++){
						listj = updownList.get(j);
						if(listi[0] * listi[1] * listj[0] * listj[1] < sum){
							sum = listi[0] * listi[1] * listj[0] * listj[1];
							topx = listi[0];
							topy = listi[1];
							downx = listj[0];
							downy = listj[1];
							geti  = i;
							getj = j;
						}
					}
				}
				if(getj > geti){
					updownList.remove(getj);
					updownList.remove(geti);
				}else{
					updownList.remove(geti);
					updownList.remove(getj);	
				}
				if(topx * downy > topy * downx){
					int[] listinput = {downx, topy};
					updownList.add(listinput);
				}else{
					int[] listinput = {topx, downy};
					updownList.add(listinput);
				}
				listsum = listsum + sum;
			}
			System.out.println(listsum);

		
	}

}