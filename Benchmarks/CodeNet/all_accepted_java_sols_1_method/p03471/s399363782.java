import java.util.*;
 
class Main {
  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	int mo = sc.nextInt();
      
      for(int i = 0;i <= N;i++){
      	for(int j = 0;j+i<= N;j++){
              if(i*10000+j*5000+(N-i-j)*1000==mo){
                	System.out.print(i+" "+j+" "+(N-i-j));
                          	return;
                          }
          }
        }
      System.out.print(-1+" "+-1+" "+-1);
    }
}