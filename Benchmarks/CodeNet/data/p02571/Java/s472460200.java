
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 本文
        String s = sc.next();
      	int sL=s.length();

        // 部分
        String t = sc.next();
     	int tL=t.length();
      	
      	//何文字あっているか
      	int[] point=new int[sL-tL+1];
      
      	int maxPoint=0;

		for(int i=0;i<(sL-tL+1);i++){
          for(int j=0;j<tL;j++){
            if(s.charAt(i+j)==t.charAt(j)){
              point[i]+=1;
            }
          }
          if(maxPoint<=point[i]){
            maxPoint=point[i];
          }
        }
      
      	System.out.println(tL-maxPoint);
      
      
      
      
    }
}