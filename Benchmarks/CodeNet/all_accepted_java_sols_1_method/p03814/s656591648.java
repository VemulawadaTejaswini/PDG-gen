import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
      	int i = 0;
        int count = 0; 
        int start = 0;
      	int finish = 0;
      	String[] List = S.split("");
 
		for(i = 0;i < List.length; i++){
          if(List[i].equals("A")){
             start = 1;
          }
          if(start == 1){
            count += 1;
            if(List[i].equals("Z")){
              finish = count;
            }
          }
        }
          System.out.println(finish);
    }
}