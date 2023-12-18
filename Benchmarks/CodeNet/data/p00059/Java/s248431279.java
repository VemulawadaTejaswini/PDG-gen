package aoj0059;

import java.util.*;
public class Main {

	private boolean isRange(double target, double begin, double end){
		if(begin > end){
			double temp = begin;
			begin = end;
			end = temp;
		}
		if(begin <= target && target <= end)
			return true;
		else
			return false;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double [][] read = new double[4][2];
			for(int i=0; i < 4; i++){
				read[i][0] = sc.nextDouble();
				read[i][1] = sc.nextDouble();
			}

			double [][] vertexB = new double[4][2];
			for(int i=0; i < 2;i++){
				vertexB[i][0] = read[i+2][0];
				vertexB[i][1] = read[i+2][1];
			}
			vertexB[2][0] = vertexB[0][0];
			vertexB[2][1] = vertexB[1][1];
			vertexB[3][0] = vertexB[1][0];
			vertexB[3][1] = vertexB[0][1];

			boolean flg = false;
			for(int i=0; i < 4; i++){
				if(isRange(vertexB[i][0], read[0][0], read[1][0]) &&
						isRange(vertexB[i][1], read[0][1], read[1][1])){
					flg = true;
					break;
				}
			}
			if(flg)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		int n = sc.nextInt();

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}