import java.util.Scanner;

public class Main{
  public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
    
   while(true){
    int n = sc.nextInt();
    int r = sc.nextInt();
    String str = sc.next();
    String[]nr = str.split(" ");

    if(n==0&&r==0){ break; }

    int[] values = new int[n];
    for(int i = 0;i < values.length; i++){
      values[i] = i + 1;
    }
    for(int i = 0; i < r; i++){
       int p = sc.nextInt();
       int c = sc.nextInt();
       
       String[]pc = str.split(" ");
       
       
       for(int j = p; j<p+c;p++ ){
           values[j] = values[j]-p+1;
           values[j-p+1]=values[j-p+1]+c;
	       }
    }
     for(int i = 0; i < n; i ++){
       System.out.println(values[i]);
     }
   }
  }
}