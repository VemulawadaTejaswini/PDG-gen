import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int[] wPoint = new int[10];
			for(int i=0;i<10;i++){
				wPoint[i] = Integer.parseInt(scan.nextLine());
			}
			int[] kPoint = new int[10];
			for(int i=0;i<10;i++){
				kPoint[i] = Integer.parseInt(scan.nextLine());
			}
			Point w = new Point(wPoint);
			Point k = new Point(kPoint);
			System.out.println(w.getPoint() + " " + k.getPoint());
		}
	}
}

class Point{
	private int p;
	
	public Point(){
		p = 0;
	}
	
	public Point(int[] num){
		getSumPoint(num);
	}
	
	public int getPoint(){
		return p;
	}
	
	public void getSumPoint(int[] num){
		int sum = 0;
		int[] maxPoint = {0,0,0};
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			if(maxPoint[0] < num[i]){
				maxPoint[2] = maxPoint[1];
				maxPoint[1] = maxPoint[0];
				maxPoint[0] = num[i];
			}else if(maxPoint[1] < num[i]){
				maxPoint[2] = maxPoint[1];
				maxPoint[1] = num[i];
			}else if(maxPoint[2] < num[i]){
				maxPoint[2] = num[i];
			}
		}
		
		for(int i=0;i<3;i++){
			sum += maxPoint[i];
		}
		p = sum;
	}
}