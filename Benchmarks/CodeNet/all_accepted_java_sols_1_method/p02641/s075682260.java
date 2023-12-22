import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int flag=scan.nextInt();
    int num=scan.nextInt();
    int[] stk=new int[num];
    for(int a=0; a<num; a++){
      stk[a]=scan.nextInt();
    }
    boolean tmp=true;
    int ans=0;
    int count=0;
    boolean cap=true;
    boolean capplus=true;
    boolean capminus=true;
    while(tmp){
      capplus=true;
      capminus=true;
      cap=true;
      if(flag-count>0){
        for(int a=0; a<num; a++){
          if(flag-count==stk[a]){
            cap=false;
            capminus=false;
          }
        }
      }
      if(!cap){
        cap=true;
        for(int a=0; a<num; a++){
          if(flag+count==stk[a]){
            cap=false;
            capplus=false;
          }
        }
      }
      if(cap){
        if(capminus){
           ans=flag-count;
        }
        else if(capplus){
           ans=flag+count;
        }
        tmp=false;
      }
      count++;
    }
    System.out.println(ans);
  }
}
