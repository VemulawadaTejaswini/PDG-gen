import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    String s=sc.next();
    String ss[]=s.split("");
    int n[]=new int[ss.length];
    for(int i=0;i<ss.length;i++){
      n[i]=Integer.parseInt(ss[i]);
    }

    int count1=0;
    int count2=0;

    for(int i=0;i<n.length;i++){
      if(i%2==0){
        if(n[i]==0){
          count1++;
        }
      }else{
        if(n[i]==1){
          count1++;
        }
      }
      if(i%2==0){
        if(n[i]==1){
          count2++;
        }
      }else{
        if(n[i]==0){
          count2++;
        }
      }
    }
    

    if(count1<count2){
      System.out.println(count1);
    }else{
      System.out.println(count2);
    }


	}
}
