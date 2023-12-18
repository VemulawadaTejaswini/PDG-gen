import java.util.Scanner;
public class Main {
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;;i++){
		  int h=sc.nextInt();
		  int w=sc.nextInt();
	  if(h==0 && w==0){
		  break;
	  }
	  if(h<=300 && h>=1 && w<=300 && w>=1){
		  for(int j=0;j<h;j++){
			  for(int k=0;k<w;k++){
				  System.out.printf("#");
			  }
			  System.out.printf("\n");
		  }
		  System.out.printf("\n");
	  }
	 }
  }
}