import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String a=sc.next();
		int b=sc.nextInt();
		int i=0;
		int j=0;
		int[][] cards=new int [4][13];
      	if(a.equals("S")){
      		cards[0][b-1]=1;
      	}else if(a.equals("H")){
      		cards[1][b-1]=1;
      	}else if(a.equals("C")){
      		cards[2][b-1]=1;
      	}else{
      		cards[3][b-1]=1;
      	}
      	for(i=0; i<4; i++){
      		for(j=0; j<b; j++){
      			if(cards[i][j]!=1){
      				if(i==0){
      					System.out.println("S "+j);
      				}else if(i==1){
      					System.out.println("H "+j);
      				}else if(i==2){
      					System.out.println("C "+j);
      				}else{
      					System.out.println("D "+j);
      				}
      			}
      		}
      		
      	}
		
		// TODO Auto-generated method stub

	}

}