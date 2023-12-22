import java.util.*;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int n=as.nextInt();
		int i=0;
		String a;
		int b;
		
		int card[][];
		card = new int[4][13];
		//Arrays.fill(card, 0);
		String str;
		
		
		while(i<n){
			
			a=as.next();
		    b=as.nextInt();
			
			switch(a){
			
			case"S":
				card[0][b-1]=1;
				break;
			
			case"H":
				card[1][b-1]=1;
				break;
				
			case"C":
				card[2][b-1]=1;
				break;
				
			case"D":
				card[3][b-1]=1;
				break;
				
			}
			i++;
			
		}
			
			
		for(i=0;i<4;i++){
			
			switch(i){
						
						case 0:
							for(int j=0;j<13;j++){
								
								if(card[0][j]==0){
									str="S "+(j+1);
									System.out.println(str);
								}
							}
							break;
						
						case 1:
							for(int j=0;j<13;j++){
								
								if(card[1][j]==0){
									str="H "+(j+1);
									System.out.println(str);
								}
							}
							break;
							
						case 2:
							for(int j=0;j<13;j++){
								
								if(card[2][j]==0){
									str="C "+(j+1);
									System.out.println(str);
								}
							}
							break;
							
						case 3:
							for(int j=0;j<13;j++){
								
								if(card[3][j]==0){
									str="D "+(j+1);
									System.out.println(str);
								}
							}
							break;
			}
						
		}
			
	}
		
		

}