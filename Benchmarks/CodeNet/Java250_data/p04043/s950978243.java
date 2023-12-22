import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int a,b,c;
    String str;
    Scanner scr = new Scanner(System.in);
    a = scr.nextInt();
    b = scr.nextInt();
    c = scr.nextInt();
    if(a==7) {
    	if(b==5 && c==5) {
    		str="YES";
    	}else{
    		str="NO";
    	}
    }else if(a==5) {
    	if(b==5 && c==7) {
    		str="YES";
    	}else if(b==7 && c==5) {
    		str="YES";
    	}else {
    		str="NO";
    	}
    }else{
    	str="NO";
    }
    System.out.println(str);
  }
}