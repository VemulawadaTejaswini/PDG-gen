import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int c1 = 0,c2 = 0;
    String s = sc.next();
    int count=0;
    int box[]=new int[n1];
    boolean ac = false;
    for(int i = 0;i < n1-1;i++){
        if(s.charAt(i)=='A'&&s.charAt(i+1)=='C'){
          count++;
    	}
      box[i+1]=count;
    }
    for(int l = 0;l < n2;l++){
      c1 = sc.nextInt();
      c2 = sc.nextInt();
      System.out.println(box[c2-1]-box[c1-1]);
    }
  }
}