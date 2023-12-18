import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		int[][] cards=new int [4][13];
		for(i=0; i<n; i++){
			String a=sc.next();
			int b=sc.nextInt();
			if(a.equals("S")){
				cards[0][b-1]=1;
			}else if(a.equals("H")){
				cards[1][b-1]=1;
			}else if(a.equals("C")){					
				cards[2][b-1]=1;
			}else if(a.equals("D")){
				cards[3][b-1]=1;
			}
		}
      	for(i=0; i<4; i++){
      		for(j=0; j<13; j++){
      			if(cards[i][j]!=1){
      				if(i==0){
      					System.out.println("S "+(j+1));
      				}else if(i==1){
      					System.out.println("H "+(j+1));
      				}else if(i==2){
      					System.out.println("C "+(j+1));
      				}else if(i==3){
      					System.out.println("D "+(j+1));
      				}
      			}
      		}
      		
      	}
		
		// TODO Auto-generated method stub

	}

}