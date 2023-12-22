import java.util.*;


public class Main{
  
  public static void main(String[] args){
    ArrayList<Integer> array = new ArrayList<Integer>();
      
    
    Scanner scan = new Scanner(System.in);
    int val1 = scan.nextInt();
    int val2 = scan.nextInt();
    int val3 = scan.nextInt();
  	
    array.add(val1);
    array.add(val2);
    array.add(val3);
    
   
    int five=0;
    int seven=0;
    
    for (int i=0; i<array.size(); i++){
        if (array.get(i)==5){
            five++;
        }if(array.get(i)==7){
            seven++;
        }else{
            
        }   
    }
    
    if(five==2 && seven==1){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
 
  }
  
 
}