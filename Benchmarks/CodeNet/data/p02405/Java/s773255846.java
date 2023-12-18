import java.util.Scanner;
class Main
{
   public static void main(String[] args)
  	{
  	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    	int n=0;
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	if(H==0 && W==0)break;
   	
    	for(int i = 0; i<W; i++){
       	for(int j = 0; j<H; j++){
          	if((i+j)/2==0)System.out.print("#");
          	else System.out.print(".");
       	}
       	System.out.println();     	
    	}
    	System.out.println();
}
}
}

