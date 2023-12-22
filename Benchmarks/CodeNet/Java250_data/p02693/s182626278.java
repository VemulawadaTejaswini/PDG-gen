import java.util.*;
class Main{
		public static void main(String argsp[]){
        	Scanner s=new Scanner(System.in);
 			int k=s.nextInt();
          	int a=s.nextInt();
          	int b=s.nextInt();
          	for(int i=a;i<=b;i++){
            	if(i%k==0){
                System.out.println("OK");
                  return;
                }
            }
          System.out.println("NG");
        }
}