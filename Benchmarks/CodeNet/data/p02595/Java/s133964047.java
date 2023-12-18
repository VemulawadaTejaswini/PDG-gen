import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//点の数
      	int d = sc.nextInt();//距離
        int x[] =new int[n];
        int y[] =new int[n];
      	int count=0;
      
      for(int i=0;i<n;i++){
        x[i]=sc.nextInt();      
        y[i]=sc.nextInt(); 
      }
      
      for(int i=0;i<n;i++){
    	if((x[i]*x[i]+y[i]*y[i])<=d*d){
			count+=1;
        }
      }
      
     System.out.println(count); 
    } 
}




