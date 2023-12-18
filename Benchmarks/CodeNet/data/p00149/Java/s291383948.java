import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] list = new int[2][4];
		
		 while(sc.hasNext()){
			 String[] eye = sc.nextLine().split(" ");
			 
			 for(int i = 0; i < 2; i++){
				 if(Double.parseDouble(eye[i]) >= 1.1)
					 list[i][0]++;
				 else if(Double.parseDouble(eye[i]) >= 0.6 && Double.parseDouble(eye[i]) < 1.1)
					 list[i][1]++;
				 else if(Double.parseDouble(eye[i]) >= 0.2 && Double.parseDouble(eye[i]) < 0.6)
					 list[i][2]++;
				 else if(Double.parseDouble(eye[i]) < 0.2)
					 list[i][3]++;
			 }
			 }
		 for(int i = 0; i < 4; i++)
				 System.out.println(list[i][0] + " " + list[i][1]);
		 
		 sc.close();
		 }
	}