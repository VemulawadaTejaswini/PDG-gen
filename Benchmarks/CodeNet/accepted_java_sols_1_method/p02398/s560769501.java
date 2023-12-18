import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
 
    public static void main(String[] args)throws IOException{
 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] numList = str.split(" ");
    int a = Integer.parseInt(numList[0]);
    int b = Integer.parseInt(numList[1]);
    int c = Integer.parseInt(numList[2]);
    
    int count = 0;
     
    for(int i = a; i < (b+1); i++){
        if(c % i == 0){
        count++;
        }
    }
 
    System.out.println(count);
     
    }
}
 