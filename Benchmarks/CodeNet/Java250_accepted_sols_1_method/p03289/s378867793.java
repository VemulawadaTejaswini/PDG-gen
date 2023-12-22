import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    int Len=S.length();
    String model="abcdefghijklmnopqrstuvwxyz";
    
    if(S.charAt(0)=='A'){
    }else{
      System.out.println("WA");
      return;
    }
    
    int Count=0;
    int index=-1;
    for(int i=2;i<Len-1;i++){
      if(S.charAt(i)=='C'){
        Count++;
        index=i;
      }
      if(Count>=2){
        System.out.println("WA");
        return;
      }
    }
    
    if(Count==0){
      System.out.println("WA");
      return;
    }
    
    
    
    for(int i=1;i<Len;i++){
      if(i==index){
      }else{
        for(int j=0;j<26;j++){
          if(S.charAt(i)==model.charAt(j)){
            j=26;
          }
          if(j==25){
            System.out.println("WA");
            return;
          }
        }
      }
    }
    
    System.out.println("AC");
   
  }
}