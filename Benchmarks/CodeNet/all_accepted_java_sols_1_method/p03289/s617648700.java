import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      	int cnt = 0;
        int cnt2 = 0;
      
      if(s.charAt(0)=='A'){
      	for(int i = 2;i < s.length()-1;i++){
        	if(s.charAt(i)=='C'){cnt++;}
        }if(cnt==1){
          for(int i = 0;i < s.length();i++){
          	if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){cnt2++;}
          }
        }
      }
      		if(cnt2==2){
            System.out.println("AC");
        	System.exit(0);
            }
      		System.out.println("WA");
        	System.exit(0);
      
      }
}