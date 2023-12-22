import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    HashMap<String,Integer> week=new HashMap<String,Integer>();
    String S=scan.nextLine();
    week.put("MON",0);
    week.put("TUE",1);
    week.put("WED",2);
    week.put("THU",3);
    week.put("FRI",4);
    week.put("SAT",5);
    week.put("SUN",6);
    
    for(int value:week.values()){
      if(value==week.get(S)){
        int ans=6-value;
        if(ans>0){
          System.out.println(ans);
         }
        else{
          System.out.println(ans+7);
       }
       break;
      }
      }
    }
}