import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=0,max=0;
    String str=sc.next();
    sc.close();
    for(int i=0;i<n;i++){
      switch(str.charAt(i)){
        case 'I':
        cnt++;
        if(cnt>max){
          max++;
        }
        break;
        case 'D':
        cnt--;
        break;
      }
    }
    System.out.println(max);
  }
}