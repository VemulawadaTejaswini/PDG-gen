import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
      	int count=0;
      	for(int i=0;i<s.length();i+=2){
          if(i+1==s.length()){
          	count+=Integer.parseInt(s)-Math.pow(10,i)+1;
          }else{
          count+=Math.pow(10,i)*9;
          }
        }
		System.out.println(count);
		
	}
}