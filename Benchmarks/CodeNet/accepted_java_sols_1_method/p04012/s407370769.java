import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      	String s = sc.next();
      	int nam[] = new int[26];
      
      for(char i=0; i< s.length();i++){
      		nam[s.charAt(i)-97]++;
      }
      
      for(int j = 0; j < 26;j++){
      		if(nam[j]%2!=0){
            	System.out.print("No");
				System.exit(0);
      	}
      }
      	System.out.print("Yes");
    }
}