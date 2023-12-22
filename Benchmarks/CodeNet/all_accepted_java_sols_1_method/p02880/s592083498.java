import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        for(int i=1;i<10;i++){
          for(int j=1;j<10;j++){
            if(i*j==N){
              System.out.println("Yes");
              System.exit(0);
            }
          }
        }
      System.out.println("No");
    }
}