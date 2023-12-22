import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");
        int countA=1;
        int countB=0;
        String B="";
        for(int i=1;i<array.length;i++)
          if(array[0].equals(array[i]))countA++;
          else if(B=="")B=array[i];
        for(int i=0;i<array.length;i++)
          if(B.equals(array[i]))countB++;
       
       // 出力
		//System.out.println(countA + " " + countB);
      if(countA==countB&& countB == 2)System.out.println("Yes");
      else System.out.println("No");
	}
}