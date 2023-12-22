import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int c500 = Integer.parseInt(br.readLine());
    int c100 = Integer.parseInt(br.readLine());
    int c50 = Integer.parseInt(br.readLine());
    int total = Integer.parseInt(br.readLine());
    
    int choice = 0;
    int left = total;
    
    for(int i = 0; i<=c500; i++){
      for(int j = 0; j<=c100; j++){
        for(int k = 0; k <= c50; k++){
          if (i * 500 + j * 100 + k * 50 == total){
            choice++;
          }else if(i * 500 + j * 100 + k *50 > total){
            break;
          }
        }
      }
    }
    System.out.println(choice);
  }
}
          
