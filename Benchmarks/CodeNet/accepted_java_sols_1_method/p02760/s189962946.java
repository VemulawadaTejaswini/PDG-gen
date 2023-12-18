import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="No";
        int[][] a=new int[3][3];
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
            	a[i][j]=sc.nextInt();
            }
        }
        int n=sc.nextInt();
      int b=0;
      boolean[][] c=new boolean[3][3];
        for(int k=0;k<n;k++){
          b=sc.nextInt();
        	for(int i=0;i<3;i++){
        		for(int j=0;j<3;j++){
            		if(a[i][j]==b){
                		c[i][j]=true;
                	}	
            	}
        	}
        }
      for(int i=0;i<3;i++){
      	if(c[i][0]&&c[i][1]&&c[i][2])o="Yes";
      }
      for(int i=0;i<3;i++){
      	if(c[0][i]&&c[1][i]&&c[2][i])o="Yes";
      }
      if(c[0][0]&&c[1][1]&&c[2][2])o="Yes";
       if(c[0][2]&&c[1][1]&&c[2][0])o="Yes";
      
      System.out.println(o);
    }
    
}