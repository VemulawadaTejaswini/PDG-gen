import java.util.Scanner;
	public class Main {
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     boolean h = false;
	for(int a=1; a<=9; a++){
      for(int b=1; b<=9; b++){
               if(a*b==n){
         h = true;
      }  
	 }
    }
      System.out.println(h?"Yes":"No");
	 }
	}