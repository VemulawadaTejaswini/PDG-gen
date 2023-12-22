import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        String[] list = new String[N];
        String ans = "No";
       
        for(int i = 0; i < N; i++){
           list[i] = sc.next();
        }
      
        for(int i = 1; i < N; i++){
          char[] first = list[i-1].toCharArray();
          char[] second = list[i].toCharArray();
          if(first[first.length-1] != second[0]){
            System.out.println("No");
            return;  
          }else{
            continue;
          }
        }
      
        for(int i = 0; i < N; i++){
          String a = list[i];
          for(int j = i+1; j < N; j++){
            String b = list[j];
            if(a.equals(b)){
              System.out.println("No");
              return;
            }else{
              continue;
            }
          }
        }
      
       System.out.println("Yes");
	}

}