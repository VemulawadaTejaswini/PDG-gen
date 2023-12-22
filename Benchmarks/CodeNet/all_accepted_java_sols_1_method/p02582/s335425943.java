import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int ans = 0;
    int i = 0;
    if(s.charAt(i) == 'R'){
      ans++;
      if(s.charAt(i + 1) == 'R'){
        ans++;
        if(s.charAt(i + 2) == 'R'){
        	ans++;
          
        }
      }
    }else if(s.charAt(i + 1) == 'R'){
      ans++;
      if(s.charAt(i + 2) == 'R'){
        ans++;
        
      }
    }else{
      if(s.charAt(i + 2) == 'R'){
        ans++;
        
      }
    }
  
System.out.print(ans);
  }
}