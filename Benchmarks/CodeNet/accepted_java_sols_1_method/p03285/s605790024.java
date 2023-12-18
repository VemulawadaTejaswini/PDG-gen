import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      int m=Integer.parseInt(line);
      boolean t=false;
      for(int i=0;i<=m;i+=4){
      	for(int j=i;j<=m;j+=7){
        	if(j==m){
            	t=true;
              break;
            }
        }
        if(t)break;
      }
      if(t)System.out.println("Yes");
      else System.out.println("No");
    }
}