import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

		int o= 0 ,p = 0,q = 0;
		int a = 0, b = 0, c = 0;
		char ch;
		String str;
		
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int AB = A+B;
        String S = sc.next();
        char[] c1 = S.toCharArray();
        

        while(true){
           
           if(c1[a]=='a' && AB > b )
           {
               System.out.println("Yes"); 
               b++;
           }
           else if(c1[a]=='b' && AB > b && c < B)
           {
               System.out.println("Yes"); 
               b++;
               c++;
           }
           else
           {
                System.out.println("No"); 
           }
           
           
            a++;
            if(a==N)break;
        }


       // System.out.print();
        System.out.println();
	}
}