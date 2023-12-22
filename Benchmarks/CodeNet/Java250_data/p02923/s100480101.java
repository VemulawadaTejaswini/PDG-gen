import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long H[] = new long[N];
	
	sc.nextLine();
	for (int i=0; i<N; i++){
		H[i] = sc.nextInt();
	}
	
	int NumMove = 0;
	int tmpNumMove = 0;
	
	for (int i=0; i<N-1; i++){
		if(H[i] >= H[i+1]){
			tmpNumMove++;
        }else{
			if(tmpNumMove > NumMove){
				NumMove = tmpNumMove;
            }
			tmpNumMove = 0;
		}
	}
    
    if(tmpNumMove > NumMove){
      NumMove = tmpNumMove;
    }
    
    System.out.println(NumMove);
  }
}