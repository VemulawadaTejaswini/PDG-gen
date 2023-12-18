import java.util.Scanner;
public class Main{
public static void main(String srg[]){
	Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
	
    int b=10;
  	int count=0;
  	for(int i=0;i<4;i++){
      
      int c =a%b;
      if(c==2)count++;
      a=a/10;
    }
  
    System.out.println(count);
    scan.close();
}
}
