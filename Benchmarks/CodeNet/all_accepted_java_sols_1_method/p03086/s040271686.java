import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int max = 0,count=0,len=s.length();
    for(int i = 0;i < len;i++){
      switch(s.charAt(i)){
        case 'A':
          count++;
          break;
        case 'T':
          count++;
          break;
        case 'G':
          count++;
          break;
        case 'C':
          count++;
          break;
        default:
          count=0;
      }
      if(max < count)max=count;
    }
    System.out.println(max);
  }
}