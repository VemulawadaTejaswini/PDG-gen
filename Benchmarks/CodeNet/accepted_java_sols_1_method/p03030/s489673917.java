import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String,HashMap<Integer,Integer>> res = new HashMap<>();
    List<String> list = new ArrayList<>();
    
    for(int i = 1;i <= n; ++i){
      //市
      String s = sc.next();
      //同じのあるかな
      if(res.containsKey(s)){
        //点とレストラン番号
        HashMap<Integer,Integer> po_num = res.get(s);
        po_num.put(sc.nextInt(), i);
        res.remove(s);
        res.put(s,po_num);	        
      }else{
        //ないから追加
        list.add(s);
        //点とレストラン番号
        HashMap<Integer,Integer> po_num = new HashMap<>();
        po_num.put(sc.nextInt(), i);
		res.put(s,po_num);        
      }
    }
    //ソート
    Collections.sort(list);
    //まちの数
    int s_num = list.size();
    
    for (int i = 0; i < s_num; ++i){
      String s = list.get(i);
      HashMap<Integer,Integer> po_num = res.get(s);
      Object[] result = po_num.keySet().toArray();
      Arrays.sort(result);
      int count = result.length;
      
      for (int j = 1; j <= count; ++j){
        int ans = (Integer)result[count-j];
        System.out.println(po_num.get(ans));
      }
    }

  }
}