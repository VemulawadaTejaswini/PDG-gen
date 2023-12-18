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

      int ac=intArray[0]*intArray[2];
      int ad=intArray[0]*intArray[3];
      int bc=intArray[1]*intArray[2];
      int bd=intArray[1]*intArray[3];
      int Max=0;

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
      
       System.out.println(Max);
        scan.close();
	}
}