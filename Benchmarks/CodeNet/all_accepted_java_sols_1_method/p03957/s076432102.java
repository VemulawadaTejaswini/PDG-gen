import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);

		int o= 0 ,p = 0,q = 0;
		long a = 0, b = 0, c = 0;
		char ch;
		String str="";
		

        String s1 = sc.next();
        
        if(s1.contains("C"))o++;
        if(s1.contains("F"))o++;

//      int s = Integer.parseInt(sc.next());
//	    int[] test  = new int[100000];
        char[] c1 = s1.toCharArray();
        for(int i=0; i < s1.length(); i++){
            
        if(c1[i]=='C') str += 'C' ;
        if(c1[i]=='F') str += 'F';
            
        }
/*
        while(true){
            test[o] = Integer.parseInt(sc.next());
            o++;
            if(o==s)break;
        }
*/

        if(str.contains("CF"))System.out.print("Yes");
        else System.out.print("No");

    //    System.out.print();
        System.out.println();
	}
}