import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class Main{
  public static void main(String[]args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());
    int x;
    for(int i = 1; i <= N;i++){
      if(i % 3 == 0){
        System.out.printf(" %d",i);  
      }else{
        x = i;
		do{
          if(x%10 == 3){
            System.out.printf(" %d",i);
            break;
          }
		x /=10;
        }while(x != 0);
      }
    }
    System.out.println();
  }
}
