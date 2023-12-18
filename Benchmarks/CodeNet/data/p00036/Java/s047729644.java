import java.util.Scanner;


public class AOJ_Volume0036 {
	private static int[][] a = new int[8][8];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] s = new String[8];
			for(int i=0;i<8;i++){
				s[i] = sc.nextLine();
				String[] temp = s[i].split("");
				for(int j=0;j<8;j++){
					a[i][j] = Integer.parseInt(temp[j+1]);
				}
			}
			
			boolean flag = true;
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(Check_A(i,j) && flag){
						System.out.println("A");
						flag = false;
					}
					if(Check_B(i,j) && flag){
						System.out.println("B");
						flag = false;
					}
					if(Check_C(i,j) && flag){
						System.out.println("C");
						flag = false;
					}
					if(Check_D(i,j) && flag){
						System.out.println("D");
						flag = false;
					}				
					if(Check_E(i,j) && flag){
						System.out.println("E");
						flag = false;
					}
					if(Check_F(i,j) && flag){
						System.out.println("F");
						flag = false;
					}
					if(Check_G(i,j) && flag){
						System.out.println("G");
						flag = false;
					}
				}
			}
		}
	}
	
	private static boolean ch(int i,int j){
		if(a[i][j] == 1) return true;
		return false;
	}
	
	private static boolean Check_A(int i,int j){
		if(i+1 < 8 && j+1 < 8){
			if(ch(i,j) && ch(i+1,j) && ch(i,j+1) && ch(i+1,j+1))  return true;
		}
		return false;
	}
	
	private static boolean Check_B(int i,int j){
		if(i+1 < 8 && i+2 < 8 && i+3 < 8){
			if(ch(i,j) && ch(i+1,j) && ch(i+2,j) && ch(i+3,j)) return true;
		}
		return false;
	}
	
	private static boolean Check_C(int i,int j){
		if(j+1 < 8 && j+2 < 8 && j+3 < 8){
			if(ch(i,j) && ch(i,j+1) && ch(i,j+2) && ch(i,j+3)) return true;
		}
		return false;
	}
	
	private static boolean Check_D(int i,int j){
		if(j-1 >= 0 && i+1 < 8 && i+2 < 8){
			if(ch(i,j) && ch(i+1,j) && ch(i+1,j-1) && ch(i+2,j-1)) return true;
		}
		return false;
	}
	
	private static boolean Check_E(int i,int j){
		if(i+1 < 8 && j+1 < 8 && j+2 < 8){
			if(ch(i,j) && ch(i,j+1) && ch(i+1,j+1) && ch(i+1,j+2)) return true;
		}
		return false;
	}
	
	private static boolean Check_F(int i,int j){
		if(i+1 < 8 && i+2 < 8 && j+1 < 8){
			if(ch(i,j) && ch(i+1,j) && ch(i+1,j+1)&& ch(i+2,j+1)) return true;
		}
		return false;
	}
	
	private static boolean Check_G(int i,int j){
		if(i+1 < 8 && j+1 < 8 && j-1 >= 0){
			if(ch(i,j) && ch(i+1,j) && ch(i,j+1) && ch(i+1,j-1)) return true;
		}
		return false;
	}
}