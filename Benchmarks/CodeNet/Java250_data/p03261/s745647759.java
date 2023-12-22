import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] str = new String[n];
      boolean count = true;
      for(int i = 0;i < n;i++){
      	str[i] = sc.next();
      }
      for(int i = 1;i < n;i++){
      	for(int j = 0;j < i;j++){
        	if( str[i].equals(str[j]) ) count = false;
        }
      }
      for(int i = 1;i < n;i++){
      	if(!(str[i-1].substring(str[i-1].length()-1,str[i-1].length()).equals(str[i].substring(0,1)) ))
          count = false;
      }
      if(count)System.out.println("Yes");
      else System.out.println("No");
    }
}
