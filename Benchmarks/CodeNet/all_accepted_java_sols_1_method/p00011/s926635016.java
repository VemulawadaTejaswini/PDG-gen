import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	while (scan.hasNextInt()){
    		int numverline = scan.nextInt();
    		int[] verline = new int[numverline];
    		for(int i = 0; i < numverline; i++){
    			verline[i] = i+1;
    		}
    		int horline = scan.nextInt();
    		int[][] coor = new int[horline][2];
    		for(int i = 0; i < horline; i++){
    			String[] tmp = scan.next().split(",");
    			coor[i][0] = Integer.parseInt(tmp[0]);
    			coor[i][1] = Integer.parseInt(tmp[1]);
    		}
    		
    		for(int i = 0; i < coor.length; i++){
    			int tmp = verline[coor[i][0]-1];
    			verline[coor[i][0]-1] = verline[coor[i][1]-1];
    			verline[coor[i][1]-1] = tmp;
    		}
    		
    		for(int i = 0; i < verline.length; i++){
    			System.out.println(verline[i]);
    		}
    	}
    }
}