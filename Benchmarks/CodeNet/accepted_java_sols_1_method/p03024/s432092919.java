import java.util.*;
public class Main{
 	public static void main(String args[]){
     	Scanner sc=new Scanner(System.in);
      	String s=sc.nextLine();
      	int l=s.length();
      	int win=15-l;
      	for(int i=0;i<l;i++){
         	 if(s.charAt(i)=='o')
               win++;
        }
      if(win>=8)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
}