import java.io.*;
class Main{
	public static void main(String[] args)  throws IOException{ 
		int[][][] Room = new int[4][3][10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	String str = br.readLine();
		int line = Integer.parseInt(str);

		for(int i = 0; i < line; i++) {
 
			String str2 = br.readLine();
        	        String[] str3 = str2.split(" ");
 
                	int Building = Integer.parseInt(str3[0]);
                	int Floor = Integer.parseInt(str3[1]);
                	int RoomFirst = Integer.parseInt(str3[2]);
                	int People = Integer.parseInt(str3[3]);
 
                	Room[Building -1][Floor -1][RoomFirst -1] += People;
           	}
 
 	        for(int l = 0; l < 4; l++) {
                	for(int j = 0; j < 3; j++) {
                    		for(int k = 0; k < 10; k++) {
                        		System.out.print(" " + Room[l][j][k]);
                    		}
                    		System.out.println("");                   
                	}
                	if(l != 3) {
                 		System.out.println("####################");
                	}
		}
	}
}