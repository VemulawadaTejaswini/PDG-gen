import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc= new Scanner(System.in);

	while(true){
	
	 int H =sc.nextInt();
	 int W =sc.nextInt();
	
	 if(H == 0 &&W==0){
		break;
	 }
	 for(int i=1;i<=H;i++){
		for(int n=1;n<=W;n++){
		   if(i%2==1){
			if(n%2==1){
			 System.out.print("#");
			}else{
			 System.out.print(".");
			}
		   }else{
			if(n%2==1){
			 System.out.print(".");
			}else{
			 System.out.print("#");
			}}}
	System.out.print("\n");
}
	System.out.println();
	}
}}