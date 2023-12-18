import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main( String args[] ){
        String[] a = {"","Man","Oku","Cho","Kei","Gai","Jo","Jou","Ko","Kan","Sei","Sai","Gok","Ggs","Asg","Nyt","Fks","Mts"};

        Scanner in = new Scanner(System.in);
        while( true ) {
            BigInteger m = in.nextBigInteger();
            int n = in.nextInt();
            if( n == 0 ) break;
            BigInteger value = m.pow(n);
            StringBuffer s = new StringBuffer(value.toString());
            ArrayList<String> arr = new ArrayList<String>();
            int p = 0;
            for(int i=s.length();i>=0;i-=4){
                StringBuffer temp = new StringBuffer(s.substring(Math.max(i-4,0),i));
                int cnt = temp.length();
                for(int j=0;j<cnt;j++){
                    if( temp.charAt(0) != '0' ) break;
                    temp.deleteCharAt(0);
                }
                if( temp.length() != 0 ) arr.add(temp+a[p]);
                ++p;
            } 
            for(int i=arr.size()-1;i>=0;i--) {
                System.out.print(arr.get(i));
            }   System.out.println("");
        }
    }
}