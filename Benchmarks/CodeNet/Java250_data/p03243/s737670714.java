import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      String s[]=line.split("",0);
      int a=Integer.parseInt(s[0]);
      int b=0;
      for(int i=0;i<s.length;i++){
      	b=b*10+a;
      }
      if(b<Integer.parseInt(line)){
      	b=0;
        if(a==9){
        for(int i=0;i<s.length+1;i++){
      	b=b*10+1;
      }
        }else
        for(int i=0;i<s.length;i++){
      	b=b*10+(a+1);
      }
      }
      
        System.out.println(b);
    }
}