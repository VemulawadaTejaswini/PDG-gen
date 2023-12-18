import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner scanner = new Scanner(System.in);
    int count=0;
	int num1= scanner.nextInt();
    int num2= scanner.nextInt();
    
    int[][] a = new int[num1][2];
    for(int i=0;i<num1;i++) for(int k=0;k<2;k++) a[i][k] = scanner.nextInt();
    
    scanner.close();
    
    for(int i=0;i<num1;i++) if(Math.sqrt( Math.pow(a[i][0],2) + Math.pow(a[i][1],2) ) <= num2) count++;
    System.out.println(count);
  }
}