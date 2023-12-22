import java.util.*;
 
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
      
      List<Integer> split = new ArrayList<>();
        for (int i = 0; i < n; i++) {
	        int buf = sc.nextInt();
	        split.add(buf);
        }
        
        int resultsA = 0;
        int resultsB = 0;
        int max = 0;
        int index = 0;
        int size = split.size();
        String current = "A";
        int count = 0;
        Boolean boo = true;
        
        while(boo){
            for(int i = 0; i < size ; i++ ){
                if(max<=split.get(i)){
                    max = split.get(i);
                    index = i;
                }
            }
            split.remove(index);
            size -= 1;
            if(current.equals("A")){
                resultsA += max;
                current = "B";
            }else{
                resultsB += max;
                current = "A";
            }
            max = 0;
            if(size==0){
                boo = false;
            }
        }
        
        count = resultsA - resultsB;
	    
    System.out.println(count);
  }
}
