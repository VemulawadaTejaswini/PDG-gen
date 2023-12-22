import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        if(a%2==1){System.out.println("No");}
		else{String s = sc.next();
             String ans = "Yes";
        for(int i=0;i<a/2;i++){if(s.charAt(i)!=s.charAt(a/2+i))
        {ans="No";break;                                                 
        }                           
                              }       
		System.out.println(ans);}
	}
}