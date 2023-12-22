import java.util.Scanner;
//import java.lang.Math;

class Main{
	public static void main(String[] arg){
	

		
		Scanner sc = new Scanner(System.in);
		int[] dice=new int[6];
		for(int i=0;i<6;i++){dice[i]=sc.nextInt();}
        int[][] str = new int[100][4];
        
        
        
        str[dice[0]][0]=dice[1];
        str[dice[0]][1]=dice[2];
        str[dice[0]][2]=dice[4];
        str[dice[0]][3]=dice[3];
        
        str[dice[1]][0]=dice[0];
        str[dice[1]][1]=dice[3];
        str[dice[1]][2]=dice[5];
        str[dice[1]][3]=dice[2];
        
        
        str[dice[2]][0]=dice[0];
        str[dice[2]][1]=dice[1];
        str[dice[2]][2]=dice[5];
        str[dice[2]][3]=dice[4];
        
        str[dice[3]][0]=dice[0];
        str[dice[3]][1]=dice[4];
        str[dice[3]][2]=dice[5];
        str[dice[3]][3]=dice[1];
        
        str[dice[4]][0]=dice[0];
        str[dice[4]][1]=dice[2];
        str[dice[4]][2]=dice[5];
        str[dice[4]][3]=dice[3];
        
        str[dice[5]][0]=dice[1];
        str[dice[5]][1]=dice[3];
        str[dice[5]][2]=dice[4];
        str[dice[5]][3]=dice[2];
       /*
         str[dice[5]][4]=dice[2];
        
        str[dice[4]][0]=dice[2];
        str[dice[1]][5]=dice[2];
        str[dice[0]][1]=dice[2];
        
        str[dice[5]][2]=dice[1];
        str[dice[3]][5]=dice[1];
        str[dice[2]][0]=dice[1];
        str[dice[0]][3]=dice[1];
        
        str[dice[4]][3]=dice[0];
        str[dice[3]][0]=dice[0];
        str[dice[2]][4]=dice[0];
        str[dice[1]][2]=dice[0];
        
        str[dice[5]][1]=dice[3];
        str[dice[4]][5]=dice[3];
        str[dice[1]][0]=dice[3];
        str[dice[0]][4]=dice[3];
        
        str[dice[5]][3]=dice[4];
        str[dice[3]][0]=dice[4];
        str[dice[2]][5]=dice[4];
        str[dice[0]][2]=dice[4];
        
        str[dice[4]][2]=dice[5];
        str[dice[3]][4]=dice[5];
        str[dice[2]][1]=dice[5];
        str[dice[1]][3]=dice[5];
        
         */
        int sum=sc.nextInt();
        
        for(int i=0;i<sum;i++){
        	
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	for(int j=0;j<4;j++){
        		if(str[a][j]==b){
        			System.out.println(str[a][(j+1)%4]);
        			break;
        		}
        	}
        }
       }}
