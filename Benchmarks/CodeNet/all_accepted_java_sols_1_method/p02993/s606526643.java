import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
 	int j = Character.getNumericValue(str.charAt(0));
        int flag = 0;
 	 for(int i=1; i<str.length(); i++)
 	 {
  		int d= str.charAt(i)- '0';
                if(d == j){
                    System.out.println("Bad");
                    flag = 1;
                    break;
                }
                j = d;
  	}
        if(flag != 1)
            System.out.println("Good");
        
    }
    
}
