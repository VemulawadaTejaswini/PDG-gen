import java.util.Scanner;
public class Main{
public static void main(String srg[]){
	Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
  	int b=scan.nextInt();
  	int c=scan.nextInt();
  	int count=0;
	for(int i=0;i<a;i++){
    
  	int d=scan.nextInt();
    int e=scan.nextInt();
     if(d>=b&&e>=c)count++;
    }
  
    System.out.println(count);
    scan.close();
}
}
