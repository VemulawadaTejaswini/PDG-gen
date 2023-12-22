import java.util.*;
public class Main {
public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int[][] a = new int[3][3];
  	for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
      	a[i][j] = sc.nextInt();
	  }
    }
	int N = sc.nextInt();	
  	int[] b = new int[N];
  	for(int k=0;k<N;k++){
      	b[k] = sc.nextInt();
	}
  	for(int t=0;t<N;t++){
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          if(a[i][j] == b[t]){
            a[i][j] = 0;
          }
        }
      }
    }

    if((a[0][0]==0)&&(a[0][1]==0)&&(a[0][2]==0)){
      System.out.println("Yes");
    }else if((a[1][0]==0)&&(a[1][1]==0)&&(a[1][2]==0)){
      System.out.println("Yes");
    }else if((a[2][0]==0)&&(a[2][1]==0)&&(a[2][2]==0)){
      System.out.println("Yes");
    }else if((a[0][0]==0)&&(a[1][0]==0)&&(a[2][0]==0)){
      System.out.println("Yes");
    }else if((a[0][1]==0)&&(a[1][1]==0)&&(a[2][1]==0)){
      System.out.println("Yes");
    }else if((a[0][2]==0)&&(a[1][2]==0)&&(a[2][2]==0)){
      System.out.println("Yes");
    }else if((a[0][0]==0)&&(a[1][1]==0)&&(a[2][2]==0)){
      System.out.println("Yes");
    }else if((a[2][0]==0)&&(a[1][1]==0)&&(a[0][2]==0)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

	}
}