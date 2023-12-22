    import java.util.*;
    class Main
    {
      public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        String s1=new String();
        String s2=new String();
        
        for(int i=0; i<a;i++){
          s1+=b;
        }
        for(int i=0;i<b;i++){
          s2+=a;
        }
    	if(s1.compareTo(s2)<1)	System.out.println(s1);
    	else	System.out.println(s2);
      }
    }