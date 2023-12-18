import java.util.*;

class Main{
	public static void main(String args []){
    Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int l = scan.nextInt();
      String [] ss = new String[n];
      int i=0;
      while(i<n)
      {
        ss[i]=scan.next();
        i++;
      }
      Arrays.sort(ss);
      String res = "";
      for(String s:ss){
      	res+=s;
      }
      
      System.out.println(res);
    }
}