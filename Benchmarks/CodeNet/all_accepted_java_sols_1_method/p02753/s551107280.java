import java.util.*;
 public class Main
{ public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
       String s=sc.next();int f=0;
       s=s.toUpperCase();
       for(int i=0;i<2;i++)
       { char ch=s.charAt(i);
          if(ch=='A')
          { if(s.charAt(i+1)=='B')
             {  f=1;break;}
              
            }
            else
            { if(s.charAt(i+1)=='A')
                { f=1;
                    break;
                }
            }
        }
        if(f==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}