import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int counter  =0;
       String a = sc.next();
       String b = sc.next();
       String[] aa = a.split("");
      String[] bb = b.split("");
      String[] cc = new String[aa.length];
      for(int i =0; i< aa.length;i++){
      	if(aa[i].equals(bb[i])){
          
        }else{
        	counter++;
           
        }
      }
      System.out.println(counter);
      
    }
}