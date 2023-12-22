import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String count = "No";	
      	for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='7'){
              count = "Yes";
              break;
            }
		}
        System.out.println(count);
    }
}