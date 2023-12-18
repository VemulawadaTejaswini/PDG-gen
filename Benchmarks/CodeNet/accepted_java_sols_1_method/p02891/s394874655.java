import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long k = sc.nextInt();
    sc.close();
    char[] c = s.toCharArray();
    List<Character> cl = new ArrayList<>();
    List<Integer> cs = new ArrayList<>();
    cl.add(c[0]);
    cs.add(0);
    for (char i:c){
      int cls = cl.size() - 1;
      if (i == cl.get(cls)){
        cs.set(cls,cs.get(cls)+1);
      }else{
        cl.add(i);
        cs.add(1);
      }
    }
    long ans = 0;
    int cls = cl.size() - 1;
    if (cls == 0){
      ans = (k * (long)cs.get(0))/2;
    }else{
      if (cl.get(0) != cl.get(cls)){
        for (int i:cs){
          ans += (long)i/2;
        }
        ans *= k;
      }else{
        for (int i = 1;i<cls;i++){
          ans += (long)cs.get(i)/2;
        }
        ans = ans * k + (k-1)*((cs.get(0)+cs.get(cls))/2) + cs.get(0)/2+cs.get(cls)/2;
      }
    }
    System.out.println(ans);
  }
}