import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b[][] = new int[N][3];
for(int i = 0; i < N ; i++){
    for(int j = 0; j < 3 ; j++){
      b[i][j] = sc.nextInt();
    }
}
int place = 0;
int chk = 0;
int abs = 0;
for(int i=0; i<N; i++){
  abs = Math.abs(place - (b[i][1] + b[i][2]));
  if(b[i][0] >= place + abs){
    if(b[i][0] % 2 == 0){
      if(Math.abs(place - abs) % 2 != 0){
        chk = 1;
       }
    }else{
      if(Math.abs(place - abs) % 2 == 0){
        chk = 1;
      }
    }
  }else{
     chk = 1;
     break;
  }
   place = b[i][1] + b[i][2];
}
if(chk == 0) System.out.print("Yes");
else         System.out.print("No");
}//main
}//Main