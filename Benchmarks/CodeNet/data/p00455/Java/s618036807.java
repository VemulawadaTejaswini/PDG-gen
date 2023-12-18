import java.util.*;

public class Main{
	public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);	   
    int time[][] = new int [3][2];
	for(int i=0;i<3;i++){
		for(int j=0;j<2;j++){
	  time[i][j]+=sc.nextInt()*3600;
	  time[i][j]+=sc.nextInt()*60;
	  time[i][j]+=sc.nextInt();
		}
		time[i][0]=time[i][1]-time[i][0];
	  }
	for(int i=0; i<3;i++){
	System.out.println(time[i][0]/3600+" "+time[i][0]%3600/60+" "+time[i][0]%3600%60);
	}
	}
	}