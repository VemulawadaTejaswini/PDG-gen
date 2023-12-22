import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
      String ss[]=s.split("",0);
      int max=0,index=0;
      for(int i=0;i<ss.length;i++){
      	if(ss[i].equals("A")||ss[i].equals("C")||ss[i].equals("G")||ss[i].equals("T")){
        	index++;
          max=Math.max(max,index);
        }
        else {
          max=Math.max(max,index);
        	index=0;
        }
        
      }
      System.out.println(max);
    }
}
