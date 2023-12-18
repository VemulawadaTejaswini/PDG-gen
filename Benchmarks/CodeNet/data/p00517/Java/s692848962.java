
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int w = sc.nextInt();//????????¬??°
		int h = sc.nextInt();//?¨??????¬??°
		int n = sc.nextInt();//?¨?????????°
		int spot[][] = new int[n][2];
		int idou [][] = new int [n-1][2];
		for(int i = 0;i < n;i++){
			spot[i][0] = sc.nextInt();
			spot[i][1] = sc.nextInt();	
		}
		/*for(int i = 0;i < n;i++){
			System.out.print(spot[i][0]+" ");
			System.out.println(spot[i][1]);
		}*/
		int result = 0;
		for(int i = 0;i < n-1;i++){
			idou[i][0] = Math.abs(spot[i][0] - spot[i+1][0]);
			idou[i][1] = Math.abs(spot[i][1] - spot[i+1][1]);
			if(((spot[i][1] > spot[i+1][1])&&(spot[i][0] < spot[i+1][0]))||((spot[i][1] < spot[i+1][1])&&(spot[i][0] > spot[i+1][0]))){
				idou[i][0] = idou[i][0] + idou[i][1];
			}
			//System.out.print("?§?????????¢"+spot[i][0]+"-"+spot[i+1][0]+"??§"+idou[i][0]+" ");
			//System.out.println("?§?????????¢"+spot[i][1]+"-"+spot[i+1][1]+"??§"+idou[i][1]);
			if(idou[i][0] > idou[i][1]){
				result = result + idou[i][0];
			}
			else{
				result = result + idou[i][1];
			}
		}
		System.out.println(result);
	}

}