import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String strs = sc.next();
    String strp = sc.next();
    int snum = strs.length();
    int psum = strp.length();
    
    for(int p = 0; p < snum; p++){
      String str1 = "";
      String str2 = "";
      String str3 = "";
      for(int q = p; q < snum; q++){
        char c1 = strs.charAt(q);
        str1 += c1;
      }
      for(int r = 0; r < p; r++){
        char c2 = strs.charAt(r);
        str2 += c2;
      }
      for(int s = 0; s < psum; s++){
        char c3 = (str1+str2).charAt(s);
        str3 += c3;
      }
      
      if(str3.equals(strp)){
        System.out.println("Yes");
        break;
      }else if(p == snum-1){
        System.out.println("No");
      }
    }
  }
}
