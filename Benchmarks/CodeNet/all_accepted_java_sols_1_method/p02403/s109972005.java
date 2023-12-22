import java.util.Scanner;


public class Main {


  public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	  int H,W;
	  int n=Integer.MAX_VALUE;
	 
	  for(int i=0;i<n;i++){
		  H=Integer.parseInt(sc.next());
		  W=Integer.parseInt(sc.next());
		if(H==0&&W==0){
			break;
		}
		else{
			for(int j=0;j<H;j++){
				for(int k=0;k<W;k++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	  
	  }
	
		 
	

  }
}