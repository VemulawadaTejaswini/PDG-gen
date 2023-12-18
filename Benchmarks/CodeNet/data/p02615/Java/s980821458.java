import java.util.*;

class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = -Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    TreeMap<Integer,Integer> map = new TreeMap<>(new Comparator<Integer>(){
      public int compare(Integer o1,Integer o2){
        return o2-o1;
      }
    });
    Map.Entry<Integer,Integer> entry;
    Integer count;
    long sum = 0;
    for(int i=0;i<n;i++){
      if(map.isEmpty()){
        map.put(-a[i],1);
      }else{
        entry = map.firstEntry();
        sum+=entry.getKey();
        System.out.println(entry.getKey());
        if(entry.getValue()==1){
          map.remove(entry.getKey());
        }else{
          map.put(entry.getKey(),entry.getValue()-1);
        }
        count = map.get(-a[i]);
        if(count==null){
          map.put(-a[i],2);
        }else{
          map.put(-a[i],count+1);
        }
    }
  }
    System.out.println(sum);
}
}