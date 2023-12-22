import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next(),pre="";
    int count=0;
    for(int i=0;i<s.length();i++) {
    	String buff=s.substring(i, i+1);
    	if(buff.equals(pre)) {
    		i++;
    		if(i==s.length())break;
    		pre=buff+s.substring(i, i+1);
    	}else {
    		pre=buff;
    	}
    	count++;
    	//System.out.println(pre);
    }
    System.out.println(count);
  }
}
