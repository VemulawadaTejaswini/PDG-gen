import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next());
        String str1 = sb.substring(0,2);
        String str2 = sb.substring(2,4);
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);

        if(0 < i && i < 13){
          if(0 < j && j < 13){
            System.out.println("AMBIGUOUS");
          }else{
            System.out.println("MMYY");
          }
        }else{
          if(0 < j && j < 13){
            System.out.println("YYMM");
          }else{
            System.out.println("NA");
          }
        }
    }
}
