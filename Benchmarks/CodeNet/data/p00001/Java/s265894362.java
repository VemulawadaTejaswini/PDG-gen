import java.util.*;
class Q2
{
 public static void main(String[] av)
 {
   Scanner sc = new Scanner( System.in );
   ArrayList<Integer> al = new ArrayList<Integer>();
   while( sc.hasNextInt() )
   {
     al.add( sc.nextInt() )
    }
    Collections.sort( al ); Collections.reverse( al );
    for ( int i = 0; i < 3; ++i )
    {
     System.out.println( al.get(i) );
    }
}