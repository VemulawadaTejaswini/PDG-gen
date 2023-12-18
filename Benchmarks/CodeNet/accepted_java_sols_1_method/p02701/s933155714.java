import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt();
  	String[] s= new String[a];
  	
  	for(int i=0;i<a;i++){
  		s[i]=sc.next();
  	}
  	Arrays.sort(s);
  	int f=1;
  	
  	for(int i=1;i<a;i++){
  		if(s[0].equals(s[i])){
  		}else{
  			s[0]=s[i];
  			f++;
  		}
  	}
  	System.out.print(f);
  }
}