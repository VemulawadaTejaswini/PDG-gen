import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int X=scan.nextInt();
	int check=0;
    int Y=X;
    if(X>2){
	for(int i=X;check==0;i++){
      for(int j=2;j<i;j++){
        if(i%j==0){
          break;
        }
        if(j==i-1){
			check=1;
        }
      }
      Y=i;
    }
    }
    System.out.println(Y);
  }
}