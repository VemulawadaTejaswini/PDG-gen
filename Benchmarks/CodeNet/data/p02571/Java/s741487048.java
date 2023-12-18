    import java.util.*;
    import java.util.Arrays;
    class Main{
    public static void Main{String args[]}{
    Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String t=sc.next();
      int ar[]=new int[s.length()-t.length()];
      for(int i=0;i<s.length()-t.length();i++){
      int j;
        for(j=0;j<t.length();j++){
        if(s.charAt(i+j)!=t.charAt(i)){
        ar[i]++;
        }
        }
      
      }
    Arrays.sort(ar);
      System.out.println(ar[0]);
    }
    }