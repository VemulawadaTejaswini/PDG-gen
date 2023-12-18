import java.util.*;

public class Main {
	public static void main(String args[]){
		int number, judge,area_counter;
		int x1, y1,x2,y2;
		String[] coordinate = null;
		ArrayList<String> coordinateAll = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while(true){
			area_counter = 0;
			number = scan.nextInt();//長方形の数
			judge = scan.nextInt();//1 or 2
			if(number==0 && judge ==0){
				break;
			}
			for(int i=0;i<number;i++){
				x1 = scan.nextInt();
				y1 = scan.nextInt();
				x2 = scan.nextInt();
				y2 = scan.nextInt();
				coordinate = coordinateSet(x1,y1,x2,y2);
				for(String oneCoordinate : coordinate){
					if(!coordinateAll.contains(oneCoordinate)){
						coordinateAll.add(oneCoordinate);
						area_counter++;
					}
				}
			}
			if(judge ==1){
				coordinateAll.clear();
				System.out.print("\n" + area_counter);}
			else{
				int cf_counter = Circumference(coordinateAll);
				coordinateAll.clear();
				System.out.print("\n"+area_counter+"\n"+ cf_counter);
			}
		}
	}
	private static int Circumference(ArrayList<String> inputSet){//周長を求める
		int x,y,result=0;
		for(String eachInput : inputSet){
			Scanner scan = new Scanner(eachInput);
			x = scan.nextInt();
			y = scan.nextInt();
			String checker1,checker2;
				for(int i=-1;i<2;i=i+2){
					int new_x = x+i;
					int new_y = y+i;
					checker1 = new_x + " "+y;
					if(!inputSet.contains(checker1)){
						result++;
					}
					checker2 = x + " "+ new_y;
					if(!inputSet.contains(checker2)){
						result++;
					}
				}
		}
		return result;
	}
	private static String[] coordinateSet(int x1,int y1,int x2,int y2){//座標列の出力
		int count =0;
		int number = Math.abs(x2-x1)*Math.abs(y2-y1);
		String[] result = new String[number];
		for(int i=x1;i<x2;i++){
			for(int j=y1;j<y2;j++){
				result[count]=i+" "+j;
				count++;
			}
		}
		return result;
	}
}