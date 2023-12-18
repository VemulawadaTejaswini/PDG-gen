import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int [] Array = new int[n];
    
    for(int i = 0; i < Array.length; i++) {
    	Array[i] = stdIn.nextInt();
    }
    
    int sum = 0;
    int a = 0;
    Outer:
    do{
      a++;
    	for(int i = 0; i < Array.length; i++){
      		if(Array[i]%2!=0) break Outer;
      		else Array[i]/=2;
      		if(i==n-1){ 
              sum++;
              a --;
            }
    	}
    }while(a==0);
    
    System.out.println(sum);
  }
}