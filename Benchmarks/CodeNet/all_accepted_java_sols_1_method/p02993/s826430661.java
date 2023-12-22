import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next());
        String str1 = sb.substring(0,1);
        String str2 = sb.substring(1,2);
        String str3 = sb.substring(2,3);
        String str4 = sb.substring(3,4);
        if(str1.equals(str2)||str2.equals(str3)||str3.equals(str4)){
          System.out.println("Bad");
        }else{
          System.out.println("Good"); 
        }
    }
}
