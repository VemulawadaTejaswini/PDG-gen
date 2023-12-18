import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
 int[] intArray = Arrays.stream(scan.nextLine().split(" ")) //" "で区切ってString配列へ
    .mapToInt(Integer::parseInt) //数値にして
    .toArray(); //配列へ

      long ac=(long)1f*intArray[0]*intArray[2];
      long ad=(long)1f*intArray[0]*intArray[3];
      long bc=(long)1f*intArray[1]*intArray[2];
      long bd=(long)1f*intArray[1]*intArray[3];
      long Max=ac;

       if(Max < ac) {
        Max = ac;
       }
       if(Max < ad) {
        Max = ad;
       }
       if(Max < bc) {
        Max = bc;
       }
       if(Max < bd) {
        Max = bd;
       }
      
       System.out.println(ac);
        scan.close();
	}
}