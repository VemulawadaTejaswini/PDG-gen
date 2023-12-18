import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int num = 0;
      int max = 0;
      int length = str.length();
      for(int i=0;i<length;i++){
        switch(str.substring(i,i+1)){
          case "A":
          case "T":
          case "C":
          case "G":
            num++;
            break;
          default:
            num = 0;
        }
        if(num > max)max = num;
      }
      System.out.println(max);
	}
}