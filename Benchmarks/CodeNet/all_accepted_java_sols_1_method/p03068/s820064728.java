import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next(),res="",f="";
    int k=sc.nextInt();
    for(int i=0;i<n;i++)if(i+1==k)f=s.substring(i, i+1);
    for(int i=0;i<n;i++) {
    	if(s.substring(i, i+1).equals(f)) {
    		res+=s.substring(i, i+1);
    	}else {
    		res+="*";
    	}
    }
    System.out.println(res);
  }
}
