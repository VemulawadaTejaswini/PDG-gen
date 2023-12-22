import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//点の数
      	int d = sc.nextInt();//距離
        long x[] =new long[n];
        long y[] =new long[n];
      	int count=0;
      
      for(int i=0;i<n;i++){
        x[i]=sc.nextLong();      
        y[i]=sc.nextLong(); 
      }
      
      for(int i=0;i<n;i++){
    	if(Math.sqrt(x[i]*x[i]+y[i]*y[i])<=d){
			count+=1;
        }
      }
      
     System.out.println(count); 
    } 
}






