import java.util.*;

class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int c0 = 0;
   int c1 = 0;
   int c2 = 0;
   int c3 = 0;
   for(int i = 0; i < n; i ++){
     String s = sc.nextLine();
     if(s == "AC"){
      ++c0; 
     }else if(s == "WA"){
      ++c1;
     }else if(s == "TLE"){
      ++c2;
     }else if(s == "RE"){
      ++c3;
     }
   }
   System.out.println("AC × " + c0);
   System.out.println("WA × " + c1);
   System.out.println("TLE × " + c2);
   System.out.println("RE × " + c3);
  }
}

