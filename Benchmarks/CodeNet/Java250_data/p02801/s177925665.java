import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
String get;
get = sc.next();    
             String str = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
         
int index_s = str.indexOf(get);
String str1 = str.substring(index_s + 2, index_s + 3);

          System.out.print(str1);

      }
}