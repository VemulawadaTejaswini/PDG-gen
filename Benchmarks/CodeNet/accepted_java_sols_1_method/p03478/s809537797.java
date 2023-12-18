import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      
      int count=0;
      int compare=0;
      
      for(int i = a; i > 0 ; i--){
          compare = 0;
        
        List<String> split = Arrays.asList(String.valueOf(i).split(""));
        for(int j = 0; j < split.size(); j++ ){
            compare += Integer.parseInt(split.get(j));
        }
        
        if(b<= compare && compare <= c){
            count += i;
        }
      }
    System.out.println(count);
  }
}
