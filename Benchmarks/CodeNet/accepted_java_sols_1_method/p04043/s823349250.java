import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String answer = "YES";
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 3; i++){
            int haiku = Integer.parseInt(s.next());
          if(haiku == 7 || haiku == 5 ){
              sum = sum + haiku;
          }
          else{
              answer = "NO";
          }
        } 
        if(sum != 17){
            answer = "NO";
        }
        System.out.println(answer);
    }
}