import java.util.Scanner;

public class Main{
	public static void main(String []args)throws Exception{
    	Scanner sc=new Scanner(System.in);
      	int N=sc.nextInt();
      	boolean iswareru = false;
        for(int i = 1;i<10;i++){
              if((N % i ==0)&&(1<=N / i)&&(N / i<=9)){
                iswareru =true;
              }
        }
        if(iswareru){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }  
          
    }
}