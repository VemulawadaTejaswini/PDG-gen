import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        long K = sc.nextLong();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> repeat = new ArrayList<>();
        ArrayList<Integer> suf = new ArrayList<>();
		int posi = 0;
        int count = 1;
        while(posi <= c.length-1){
          if(posi != c.length-1){
            if(c[posi]==c[posi+1]){
              count++;
            }
            else{
              a.add(count);
              count = 1;
            }
          }
          else{
            a.add(count);
          }
          posi++;
        }
      	if(a.size() == 1){
          System.out.println((long)(a.get(0)* K/2));
        }
        if(a.size() == 2){
          System.out.println((long)(a.get(0)/2) * K +(long)(a.get(1)/2) * K);
        }
        if(a.size() >= 3){
          long ans = 0;
          pre.add(a.get(0));
          for(int i=1;i<=a.size()-1;i++){
			suf.add(a.get(i));
          }
          if(c[0]==c[c.length-1]){
            for(int i=1;i<=a.size()-2;i++){
			  repeat.add(a.get(i));
            }
			repeat.add(a.get(0)+a.get(a.size()-1));
          }
          else{
            for(int i=1;i<=a.size()-2;i++){
			  repeat.add(a.get(i));
            }
			repeat.add(a.get(a.size()-1));
            repeat.add(a.get(0));
          }
          ans += (long)pre.get(0)/2;
          for(int i=0;i<repeat.size();i++){
            ans += (long)(repeat.get(i)/2)*(K-1);
          }
          for(int i=0;i<suf.size();i++){
            ans += (long)suf.get(i)/2;
          }
          System.out.println(ans);
        }
    }
}