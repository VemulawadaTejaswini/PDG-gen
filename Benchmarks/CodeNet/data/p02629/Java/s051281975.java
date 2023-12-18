import java.util.*;
public class Main {    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong()-1;
		StringBuilder sb = new StringBuilder();
        String str[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        while(a>=0){int b = (int)a%26+0;
                    if(b<0){b+=26;}
                    sb.append(str[b]);
                    a=a/26-1;
                   }
		String ans = sb.toString();
        StringBuffer sf = new StringBuffer(ans);
		System.out.println(sf.reverse().toString());
	}
}