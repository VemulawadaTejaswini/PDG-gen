import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

		int o= 0 ,p = 0,q = 0;
		int a = 0, b = 0;
		char ch;
		String str;
		

        String s1 = sc.next();

//      int s = Integer.parseInt(sc.next());
//	    int[] test  = new int[100000];
        char[] c = s1.toCharArray();
        
        if(c[0]!='C')b++;
        if(c[1]!='O')b++;
        if(c[2]!='D')b++;
        if(c[3]!='E')b++;
        if(c[4]!='F')b++;
        if(c[5]!='E')b++;
        if(c[6]!='S')b++;
        if(c[7]!='T')b++;
        if(c[8]!='I')b++;
        if(c[9]!='V')b++;
        if(c[10]!='A')b++;
        if(c[11]!='L')b++;
        if(c[12]!='2')b++;
        if(c[13]!='0')b++;
        if(c[14]!='1')b++;
        if(c[15]!='6')b++;



        System.out.print(b);
        System.out.println();
	}
}