import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i,maxSide;
		int[] side = new int[3];
		
		for(i=0;i<num;i++){
			side[0] = scan.nextInt();
			side[1] = scan.nextInt();
			side[2] = scan.nextInt();
			
			maxSide = Math.max(side[0],side[1]);
			maxSide = Math.max(maxSide,side[2]);
			
			if(maxSide == side[0]){
				if(side[0]*side[0] == side[1]*side[1]+side[2]*side[2]){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else if(maxSide == side[1]){
				if(side[1]*side[1] == side[0]*side[0]+side[2]*side[2]){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			
			}else{
				if(side[2]*side[2] == side[0]*side[0]+side[1]*side[1]){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}
}