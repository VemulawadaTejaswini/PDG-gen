import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int i,j;
        int c[][] = new int[3][3];
      	int check = 0;
        int a[] = new int[3];
        int b[] = new int[3];      
        for(i = 0;i<3;i++){
         for(j=0;j<3;j++){
           c[i][j] = sc.nextInt();
         }
        }
      
        if(c[0][0] == 0){
          a[0] = 0;
          b[0] = c[0][0];
          a[1] = c[1][0] - b[0];
          a[2] = c[2][0] - b[0];
			for(j = 0;j< 3;j++){
                if(c[0][j] - a[0] != c[1][j] - a[1] || c[1][j] - a[1] != c[2][j] - a[2]){
                       System.out.println("No"); 
               		System.exit(0);
                  }
                }
                 System.out.println("Yes"); 
                 System.exit(0);
              
          }else{
		  for(i = 0;i <= c[0][0]; i++){
            a[0] = i;
            b[0] = c[0][0] - a[0];
            a[1] = c[1][0] - b[0];
            a[2] = c[2][0] - b[0];
            b[1] = c[1][1] - a[1];
            b[2] = c[2][2] - a[2];
             if(a[1] >=0 && a[2] >=0 && b[1] >= 0 && b[2] >= 0){
				for(j = 0;j< 3;j++){
                  if(c[0][j] - a[0] != c[1][j] - a[1] || c[1][j] - a[1] != c[2][j] - a[2]){
                         System.out.println("No"); 
               			 System.exit(0);
                  }
                }
                 System.out.println("Yes"); 
                 System.exit(0);
              }


            
          }
        }
        System.out.println("No"); 
    }
}