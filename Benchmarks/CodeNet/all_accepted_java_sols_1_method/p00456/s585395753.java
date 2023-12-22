import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       int[][]u = new int [2][10]; 
    for(int i=0;i<2;i++){
       for(int k=0;k<10;k++){
    	u[i][k]=sc.nextInt();
       }
      }
    Arrays.sort(u[0]); Arrays.sort(u[1]);
    int w=u[0][9]+u[0][8]+u[0][7];
    int k=u[1][9]+u[1][8]+u[1][7];
    System.out.println(w+" "+k);
    }
    }