import java.util.Scanner;
    public class ABC172D{
    	 public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);

    	int n=scanner.nextInt();
           int k=1;
           int t=0;
 
           	for(int i=1;i<=n;i++){
            for(int j=1;j<=n/2;j++)
              if(n%j==0){
              k=k+1;
              }
              t=t+i*k;
            }
           System.out.println(t);
    }}