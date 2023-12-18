import java.util.*;


public class Main{
  
  public static void main(String[] args){
    ArrayList<String> array = new ArrayList<String>();
      
    Scanner scan = new Scanner(System.in);
    //int val = scan.nextInt();
    //System.out.print(val);
    //int val2 = scan.nextInt();
    //System.out.print(val2);
    while(scan.hasNext()){
      array.add(scan.next());
    }
    
    Collections.sort(array);
    
    String val=""; 
    for(int i=2; i<array.size(); i++){
      val = val + array.get(i);
    }
    
    System.out.print(val);
  }
   
}